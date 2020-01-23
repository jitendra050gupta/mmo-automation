package SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		
		//ul[@class='erkvQe']//li/descendant::div[@class='sbl1 sbl1p']/span/b
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		//Actions action = new Actions(driver);
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		List <WebElement> list =driver.findElements(By.xpath("//ul[@class='erkvQe']//li/div/div[2]/div/span/b"));
		
		for(int i=0;i<list.size()-1;i++){
			List <WebElement> ls =driver.findElements(By.xpath("//ul[@class='erkvQe']//li/div/div[2]/div/span/b"));
			System.out.println("testing "+ls.get(i).getText());	
	
		}
		
		Thread.sleep(3000L);
		driver.quit();	

	}

}
