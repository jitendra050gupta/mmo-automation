package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDateFromCalender {

static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/");
		WebElement el = driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		el.click();
		String Date = "20-December-2019";
		selectDate(Date);
		
		Thread.sleep(1000);
		//driver.quit();
		
	}
	
	public static void selectDate(String Date) {
		String []date1 = Date.split("-");
		int date=Integer.valueOf(date1[0]);
		String Month = date1[1];
		String Year = date1[2];	
				
		//div[@class='DayPicker-Week' and @role='row']//child::p[text()= '29']
		String path = "//div[@class='DayPicker-Week' and @role='row']//child::p[text()= '"+date+"']";
		
		driver.findElement(By.xpath(path)).click();
	}
}
