package SeleniumTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenURLsTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		allLinks.addAll(driver.findElements(By.tagName("img")));		
		System.out.println("All available links : "+allLinks.size());
		
		List <WebElement> activeLinks = new ArrayList<WebElement>();
		
		
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getAttribute("href"));
			if(allLinks.get(i).getAttribute("href") !=null && (allLinks.get(i).getAttribute("href").contains("https"))) {
				activeLinks.add(allLinks.get(i));
			}
		}
		System.out.println("All acitive links : "+activeLinks.size());
		
		for(int j=0;j<activeLinks.size();j++) {
			
			 HttpURLConnection connection= (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			 
			 connection.connect();
			 String responseMsg = connection.getResponseMessage();
			 connection.disconnect();
			 System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+responseMsg);
			
		}
		
		
		

	}

}
