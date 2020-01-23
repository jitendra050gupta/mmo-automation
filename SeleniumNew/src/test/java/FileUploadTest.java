import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadTest {
WebDriver driver = null;
	
	@BeforeMethod
	public void setUpMethod() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	

	@Test
	public void newWindowMethodTest() throws IOException, InterruptedException {
		

		driver.get("https://zip.freeonlineapps.net/Zip");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@id='txt-zip-files']")).sendKeys("C:\\Users\\kumarguptaj\\Downloads\\ReRunFailedTest.zip");
		Thread.sleep(5000);
		
		driver.quit();
	
	
	}

}
