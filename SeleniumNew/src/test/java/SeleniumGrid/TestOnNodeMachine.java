package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestOnNodeMachine {
	static WebDriver driver = null;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		String URL = "https://www.w3schools.com";
		 String Node = "http://10.143.217.183:5656/wd/hub";
		 DesiredCapabilities cap = new DesiredCapabilities();
		 
		 ChromeOptions options = new ChromeOptions();
		 options.merge(cap);
		 driver = new RemoteWebDriver(new URL(Node), cap);
		 
		 driver.navigate().to(URL);
		 Thread.sleep(5000);
		 driver.quit();
		 } 
		
	}

