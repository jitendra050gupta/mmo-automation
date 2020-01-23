package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ERApurchase {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kumarguptaj\\Documents\\Jit\\Selenium-new\\PreRequisites\\geckodriver-v0.23.0-win64-New\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	
		driver.get("https://mmppreprod/wps/portal/omtlogin/");
		
		driver.findElement(By.xpath("//input[@id='login-username-input'][@name='userMemberNo']")).sendKeys("7125510");
		driver.findElement(By.xpath("//input[@id='login-password-input']")).sendKeys("password1");
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		Thread.sleep(10000L);
		WebElement quoteBuy = driver.findElement(By.xpath("//ul[@id='old_top_menu']//a[contains(text(),'Quote & Buy')]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", quoteBuy);
		driver.findElement(By.xpath("//span[contains(text(),'Emergency Roadside Assistance')]")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//div[@id='buyLink_TC']//div[@class='yellow-plain-button-lt']//a[@href='javascript:void(0);'][contains(text(),'BUY NOW')]")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@name,'jurisdiction')]")));
		select.selectByVisibleText("ACT");
		
		
		
		

}
}
