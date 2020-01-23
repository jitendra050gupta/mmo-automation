package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExeExamples {

	static WebDriver driver = null;

	@BeforeMethod
	public void startMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
	}

	@Test(priority = 0, enabled = false)
	public void borderAroundElement() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath(
				"//div[@class='w3-col s5 notranslate']//a[@class='w3schools-logo'][contains(text(),'w3schools')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
		Thread.sleep(3000L);

	}

	@Test(priority = 1, enabled = false)
	public void generateAlert() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Test is not passed')");
		Thread.sleep(3000L);

	}

	@Test(priority = 2, enabled = false)
	public void clickOnElement() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'LEARN HTML')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='color_h1']")).getText(), "Tutorial");
		Thread.sleep(3000L);

	}

	@Test(priority = 3, enabled = false)
	public void refreshPage() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'LEARN HTML')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(3000L);
		js.executeScript("history.go(0)");
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='color_h1']")).getText(), "Tutorial");
		Thread.sleep(3000L);
	}

	@Test(priority = 4, enabled = false)
	public void getPageTitle() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'LEARN HTML')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		element.click();
		Thread.sleep(3000L);
		String pageTitle = js.executeScript("return document.title").toString();
		Assert.assertEquals(pageTitle, "HTML Tutorial");
		Thread.sleep(3000L);
	}
		
		@Test(priority = 5, enabled = false)
		public void scrollDownPage() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;			
			Thread.sleep(3000L);
			js.executeScript("window.scrollTo(0,document.body.scrollHight)");			
			Thread.sleep(3000L);
	}
		@Test(priority = 6, enabled = true)
		public void scrollDownPageUptoElement() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;			
			Thread.sleep(3000L);
			WebElement element = driver.findElement(By.xpath("//a[@class='w3-hover-opacity']//img"));
			js.executeScript("arguments[0].scrollIntoView(true);",element);			
			Thread.sleep(3000L);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
