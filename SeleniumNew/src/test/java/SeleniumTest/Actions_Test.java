package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Test {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://www.edureka.co/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void actionTest02() throws InterruptedException {
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("header_topcat"))).build().perform();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.cssSelector("#software-testing-certification-courses"));
		builder.moveToElement(link).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='Software Testing']")).click();
		Thread.sleep(4000);
		WebElement act = driver.findElement(By.xpath("//input[@id='search-inp-overlay-new']"));
		builder.moveToElement(act).build().perform();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//span[@class='typeahead__button']"));
		builder.moveToElement(search).build().perform();
		Thread.sleep(3000);
		Action seriesOfActions;
		seriesOfActions = builder
		.sendKeys(act, "Selenium")
		.keyDown(search, Keys.SHIFT)
		.keyUp(search, Keys.SHIFT)
		.build();
		seriesOfActions.perform();
		Thread.sleep(3000);
	}
	

}
