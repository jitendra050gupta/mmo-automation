package SeleniumTest;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHowerTest {
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
		WebElement CRM = driver.findElement(By.xpath("//a[text()='CRM']"));
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(CRM).perform();
		
		driver.findElement(By.xpath("//ul[@class='rd-navbar-dropdown rd-navbar-open-right']//a[contains(text(),'Automotive CRM')]")).click();
		
		WebElement elements= driver.findElement(By.xpath("//div[@class='range text-center']"));
		List<WebElement> list = elements.findElements(By.tagName("h5"));
		for(WebElement a: list) {
			System.out.println(a.getText());
			
		}
		
		
		
	}

}
