package SikulyIntegration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTubeTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/watch?v=j2dkdqfzY9Y&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT");
		
		Screen srn = new Screen();
		Pattern ptr = new Pattern("Pause.png");	
		srn.wait(ptr, 3000);
		
		srn.click();
		
		
		
		Pattern ptr1 = new Pattern("Play.png");	
		srn.wait(ptr1, 3000);
		
		srn.click();

	}

}
