package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeTest {
	WebDriver driver;
	
	@BeforeMethod()
	public void setUp() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		
	}
	
	
	@Test
	public void iFrameTest() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='chat widget'][3]")));
		System.out.println("switched into iframe");
		Thread.sleep(5000);
		WebElement message = driver.findElement(By.id("tawkchat-chat-indicator-text"));	
		System.out.println("Message count id "+message.getText());
		
	}

}
