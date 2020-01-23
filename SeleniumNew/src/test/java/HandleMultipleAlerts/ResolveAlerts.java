package HandleMultipleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResolveAlerts {
	
	public static void resolveAlert(WebDriver driver, Boolean accept) {
	
			if(accept) {
			driver.switchTo().alert().accept();
			}
			else {
				driver.switchTo().alert().dismiss();
			}
		}		
	
	
	public static Boolean isAlertPresent(WebDriver driver, int timeOut) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		if(alert != null) {
			return true;
		}
		else {
			throw new TimeoutException();
		}
		}
		catch (TimeoutException e) {
			
			return false;
		}
			
		}	
		
	}
	
