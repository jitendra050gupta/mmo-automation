package NewFeaturesOfSelenium4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowMethod {
	
	WebDriver driver = null;
	
	@Test
	public void newWindowMethodTest() {
		WebDriverManager.chromedriver();
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		
		System.out.println(driver.getTitle());
		
		//Opening new blank tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> winIds = driver.getWindowHandles();
		
		List<String> ls = new ArrayList<String>(winIds);
		String parantWinID = ls.get(0);
		String childWinId = ls.get(1);
		
		System.out.println("Parant Window Id is " + parantWinID);
		System.out.println("Child Window Id is " + childWinId);
		
		// Open new URL in new Tab
		driver.get("https://www.javatpoint.com/");
		System.out.println(driver.getTitle());
		
		
		driver.close();
		
		driver.switchTo().window(parantWinID);
		
		System.out.println(driver.getTitle());
		
	}

}
