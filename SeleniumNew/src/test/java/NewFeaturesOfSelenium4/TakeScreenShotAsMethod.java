package NewFeaturesOfSelenium4;

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

public class TakeScreenShotAsMethod {

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

		File file1 = driver.findElement(By.xpath("//div[@class='rd-navbar-brand']//a[@title='free crm home']")).getScreenshotAs(OutputType.FILE);
		System.out.println(System.getProperty("user.dir"));
		FileUtils.copyFile(file1, new File(System.getProperty("user.dir")+"\\src\\test\\java\\NewFeaturesOfSelenium4\\Element1.png"));
		
		driver.quit();

	}

}
