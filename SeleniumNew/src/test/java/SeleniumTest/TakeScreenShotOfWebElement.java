package SeleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotOfWebElement {
	
	WebDriver driver = null;
	
	@Test
	public void getElementScreen() throws IOException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com");
		File f1 = driver.findElement(By.xpath("//section[@class='bg-image bg-image-1 section-50 section-sm-80 section-lg-top-80 section-lg-bottom-326 text-center inset-left-10 inset-right-10']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("logo.png"));
		
	}
	

}
