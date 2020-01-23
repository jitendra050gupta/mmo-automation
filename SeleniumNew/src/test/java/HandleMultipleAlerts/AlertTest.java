package HandleMultipleAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		System.out.println("URL is launched");
		driver.switchTo().frame("result1");
		System.out.println("Swiched into frame");
		driver.findElement(By.xpath("//input[@type='button' and @value='Click me']")).click();
		System.out.println("Alert is generated");
		while(ResolveAlerts.isAlertPresent(driver, 5)) {
			ResolveAlerts.resolveAlert(driver, true);
		}
		Thread.sleep(4000L);
		
		driver.quit();

	}

}
