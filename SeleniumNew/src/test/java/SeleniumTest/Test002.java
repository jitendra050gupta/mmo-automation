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

public class Test002 {
	
	
WebDriver driver;
	
	@BeforeMethod()
	public void setUp() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/find-element-selenium.html");
		
	}
	
	
	@Test
	public void iFrameTest() throws InterruptedException {
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ac acimage-left three-column image-border-light']//p"));
		
		
		for(WebElement a: list) {
			System.out.println(a.getText());
			
		}
		
		
		
	}

}
