package SeleniumTest;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test(enabled = false)
	public void implecitWaitTest() {
		System.out.println("Searching Element......");
		
		WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		System.out.println("Element found");
		System.out.println(signup.getText());
		Assert.assertEquals(signup.getText(), "SIGN UP");	
		
		WebElement element = null;
		File f1 = element.getScreenshotAs(OutputType.FILE);
		
		File f2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	}
	
	@Test
	public void mouseMovementTest() {
		Actions action = new Actions(driver);
		System.out.println("Movind mouse to CRM dropdown");
		WebElement CRM = driver.findElement(By.xpath("//li[@class='rd-navbar--has-dropdown rd-navbar-submenu']"));
		action.moveToElement(CRM).perform();
		System.out.println("Moved to CRM element");
		driver.findElement(By.xpath("//ul[@class='rd-navbar-dropdown rd-navbar-open-right']//a[contains(text(),'HIPAA CRM')]")).click();
		
	}
	
	
	
	

}
