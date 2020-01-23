package SeleniumTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CriticalXpathTest {
	WebDriver driver;

	@BeforeMethod()
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");

	}

	@Test
	public void iFrameTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("jitendra050gupta@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Jitendra@1991");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//a[contains(text(),'Test1 Test1')]"))));

		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//td[text()='Test1 Test1']//preceding-sibling::td//input[@name='id']"))).click().build().perform();
		
		

	}

}
