package ExplicitWaitTests;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class ExplicitWaitExample {
	
	WebDriver driver = null;
	
	@BeforeMethod
	@Parameters()
	public void startUp(String sit) {
		
		driver=new ChromeDriver();
		driver.get(sit);
		
	}
	 
	
	

}
