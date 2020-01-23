package NewFeaturesOfSelenium4;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetElementLocation {
	
WebDriver driver = null;
	
	@BeforeMethod
	public void setUpMethod() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	

	@Test
	public void newWindowMethodTest() throws IOException {
		

		driver.get("https://freecrm.com/");

		System.out.println(driver.getTitle());

		WebElement elemnt = driver.findElement(By.xpath("//div[@class='rd-navbar-brand']//a[@title='free crm home']"));
		System.out.println("Element's hight is "+elemnt.getRect().getHeight());
		System.out.println("Element's width is "+elemnt.getRect().getWidth());
		System.out.println("Element's X coordinate is "+elemnt.getRect().getX());
		System.out.println("Element's Y coordinate is "+elemnt.getRect().getY());
		
		driver.quit();

	}

}
