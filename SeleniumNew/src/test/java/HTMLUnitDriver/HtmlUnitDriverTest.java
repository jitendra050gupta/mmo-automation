package HTMLUnitDriver;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://freecrm.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.w3schools.com/");
		System.out.println(driver.getTitle());		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'HTML REFERENCE')]"));
		File elementScreen = element.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(elementScreen, new File("C:\\Users\\kumarguptaj\\eclipse-workspace\\SeleniumNew\\src\\test\\java\\HTMLUnitDriver\\Element.png"));

		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
