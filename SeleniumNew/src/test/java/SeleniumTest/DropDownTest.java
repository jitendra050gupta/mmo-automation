package SeleniumTest;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {
static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		//Actions action = new Actions(driver);
		
		
		//driver.findElement(By.xpath("//li[contains(@class,'active latoBlack')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//span[@class='pointer']//span[@class='arrow arrowDown']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='moreOpt']//p"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", list.get(list.size()-1));
		
		for(int i=0;i<list.size();i++) {
			List<WebElement> ls=driver.findElements(By.xpath("//div[@id='moreOpt']//p"));
			
			System.out.println(ls.get(i).getText());
			
			ls.get(i).click();
			
			Thread.sleep(3000L);
			driver.findElement(By.xpath("//span[@class='pointer']//span[@class='arrow arrowDown']")).click();
			//driver.navigate().refresh();
		}
		
		Thread.sleep(3000L);
		driver.quit();		
		
	}
}
