package GuestWiFiLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuestWiFiLogin {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://msftconnecttest.com/redirect");
		
	}
	
	@Test
	@Parameters({"userName", "password"})
	public void login(String userName, String password) {
		driver.findElement(By.xpath("//input[@id='user.username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='user.password']")).sendKeys(password);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='aupAccepted']"));
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(element).click().build().perform();
		driver.findElement(By.xpath("//input[@id='ui_login_signon_button']")).click();
		
		driver.findElement(By.xpath("//button[@id='ui_aup_accept_button']")).click();
		
		
		
				
		
		
	}
	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}
	

}
