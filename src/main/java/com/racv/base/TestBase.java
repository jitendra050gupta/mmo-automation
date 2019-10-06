package com.racv.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.racv.util.ExcelReader;
import com.racv.util.WebEventListener;



public class TestBase {
	
	public static Properties prop;
	public static ExcelReader excel;
     public static WebDriver driver;
     public static EventFiringWebDriver eventDriver;
     public static WebEventListener handler;
     
	
	
	public TestBase() {
		try {
			prop= new Properties();
			// System.out.println(System.getProperty("user.dir"));
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\racv\\config\\config.properties");
			prop.load(fis);
			
			
			// excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\racv\\testdata\\testdata.xlsx");
						
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void init() {
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.dirver", "chromedriver.exe");
			driver = new ChromeDriver();
		}else if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
	        }else if (prop.getProperty("browser").equals("ie")) {
	        	System.setProperty("webdriver.ie.dirver", "IEDriverServer.exe");
		     driver = new InternetExplorerDriver();
	        }
	       eventDriver = new EventFiringWebDriver(driver);
		 
		 handler = new WebEventListener();
		 eventDriver.register(handler);
		//driver = eventDriver;
		
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("site"));
		
		
	}
	
	
	
	

}
