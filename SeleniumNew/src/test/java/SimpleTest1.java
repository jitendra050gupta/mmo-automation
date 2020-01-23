import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTest1 {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.papajohns.com/order/menu?special=Parties");
		
		// Click on Order Now for a product
		
		driver.findElement(By.xpath("//input[@name='email']//h2[contains(text(),'New Garlic')]/ancestor::section/descendant::li//span[contains(text(),'Garlic')]/ancestor::form//a[contains(text(),'Order Now')]")).click();


		Thread.sleep(2000L);
		driver.quit();
		
		
		
	}

}
