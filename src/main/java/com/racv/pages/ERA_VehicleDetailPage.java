package com.racv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.racv.base.TestBase;

public class ERA_VehicleDetailPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 150);

	String eraStartDate = prop.getProperty("eraStartDate");
	String eraStartMonth = prop.getProperty("eraStartMonth");
	String eraStartYear = prop.getProperty("eraStartYear");
	@FindBy(xpath="//span[@class='activeText']")
	public WebElement pageStep2;
	
	@FindBy(xpath="//span[@id='jurisdiction_1-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")
	public WebElement stateDropdown;	
	
	@FindBy(xpath="//input[@id='regis_1']")
	public WebElement regoNumber;
	
	@FindBy(xpath="//input[@id='findByRego_1']")
	public WebElement findCarBtn;
	
	
	@FindBy(xpath="//span[@id='effDay-button']")
	public WebElement dateDropdown;
	
	@FindBy(xpath="//a[@tabindex='-1'][contains(text(),'5')]")
	public WebElement date;
	
	@FindBy(xpath="//input[@id='vehicleReg_1']")
	public WebElement registartionField;
	
   @FindBy(xpath="//span[@id='vehicleClr_1-button']")
	public WebElement colordropdown;
	               
	String StartXpath = "//a[contains(text(),'";
	String clrmidileXpath = prop.getProperty("eraVehicleColor");
	String EndXpath = "')]";
	
	
	public WebElement color;
	
	
	@FindBy(xpath="//input[@id='vehicleYear_1']")
	public WebElement yearField;
	
	@FindBy(xpath="//span[@id='vehicleMake_1-button']")
	public WebElement makeDropdown;
	
	//@FindBy(xpath="//a[@role='option'][contains(text(),'HOLDEN')]")
	String mkemidileXpath = prop.getProperty("eraVehicleMake");
	public WebElement make;
	
	
	@FindBy(xpath="//span[@id='vehicleModel_1-button']")
	public WebElement modelDropdown;
	
	//@FindBy(xpath="//a[@role='option'][contains(text(),'BARINA')]")
	String mdlmidileXpath = prop.getProperty("eraVehicleModel");
	public WebElement model;
	
	@FindBy(xpath="//span[@id='vehicleBody_1-button']")
	public WebElement boduTypeDropdown;
	
	//@FindBy(xpath="//a[@role='option'][contains(text(),'HATCHBACK')]")
	String bdymidileXpath = prop.getProperty("eraVehicleBody");
	public WebElement bodyType;	
	
	@FindBy(xpath="//a[@id='vehicleLabel_4'][contains(text(),'Vehicle 1')]")
	public WebElement addedVehicle1;
	
	@FindBy(xpath="//input[@value='NEXT']")
	public WebElement nextButton;
	
	
	
	
	public ERA_VehicleDetailPage() {
		PageFactory.initElements(driver, this);
	}
	

	public void enterRegistrationNum(String num) {
		registartionField.sendKeys(num);		
	}
	
	public void seletVelicleManually() throws InterruptedException {
		System.out.println("Before pressing Tab waiting");
		registartionField.sendKeys(Keys.TAB);
		System.out.println("Before click on Dropdown");
		Thread.sleep(10000);
		System.out.println("After Waiting for 20 sec");
		colordropdown.click();
		color = driver.findElement(By.xpath(StartXpath+clrmidileXpath+EndXpath));
		color.click();
		
		yearField.sendKeys(prop.getProperty("eraVehicleYear"));
		yearField.sendKeys(Keys.TAB);
		Thread.sleep(8000);
		
		makeDropdown.click();
		Thread.sleep(1000);
		make = driver.findElement(By.xpath("//a[contains(text(),'HOND')]"));		
		make.click();
		Thread.sleep(8000);
		
		modelDropdown.click();
		Thread.sleep(1000);
		model = driver.findElement(By.xpath("//a[contains(text(),'CITY')]"));
		model.click();
		Thread.sleep(8000);
		
		boduTypeDropdown.click();
		Thread.sleep(1000);
		bodyType = driver.findElement(By.xpath("//a[contains(text(),'SEDAN')]"));
		bodyType.click();
		Thread.sleep(4000);
				
		
	}
	
	public void seletVelicleByRego(String state, String regoNum ) throws InterruptedException{
		String stateMidileXpath = state;
		stateDropdown.click();
		System.out.println(StartXpath+stateMidileXpath+EndXpath);		
		WebElement selectState = driver.findElement(By.xpath(StartXpath+stateMidileXpath+EndXpath));
		selectState.click();
		regoNumber.sendKeys(regoNum);
		findCarBtn.click();		
		Thread.sleep(8000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='selectedVehicleRadio_1_1']"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='selectedVehicleRadio_1_1']"))).click();
			driver.findElement(By.xpath("//label[@for='selectedVehicleRadio_1_1']")).click();
	}
	
	public void enterYear(String year) {
		yearField.sendKeys(year);
				
	}
	public ERA_SummaryPage clickNext() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", nextButton);
			return 	new ERA_SummaryPage();
	}
	
}
