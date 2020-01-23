package com.racv.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.racv.base.TestBase;

public class Car_Insurance_YourCarPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	
	@FindBy(xpath="//span[@id='vehicle_Address_Id-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")
	public WebElement AddressDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Add New Address')]")
	public WebElement addNewAddressOpyion;
	
	@FindBy(xpath="//input[@id='customerAddressNewText']")
	public WebElement addNewAddressField;
	
	@FindBy(xpath="//span[@id='vehicle_Details_Id-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")
	//span[@id='vehicle_Details_Id-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']
	public WebElement vehicleDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Add another vehicle')]")
	public WebElement addAnotherVehicleOption;
	
	@FindBy(xpath="//span[@id='select__jurisdiction-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")
	public WebElement stateDropDown;
	
	@FindBy(xpath="//input[@id='txt__motor-regis']")
	public WebElement regoTextBox;
	
	@FindBy(xpath="//input[@id='findByRego']")
	public WebElement findCarBtn;
	
	@FindBy(xpath="//div[@id='vehicle_AgeedValue_Div']")
	public WebElement agreedValueRedioBtn;
	
	@FindBy(xpath="//input[@id='vehicle_MarketValue_Id']")
	public WebElement marketValueRedioBtn;
	
	@FindBy(xpath="//div[@id='securityDevicesDivId_NA']")
	public WebElement noAddedSecurityCheckBox;
	
	@FindBy(xpath="//span[@id='carFinance-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")
	public WebElement financeTypeDropdown;
	
	@FindBy(xpath="//a[contains(text(),'No finance')]")
	public WebElement financeType;
	
	@FindBy(xpath="//span[@id='Vehicle_UsedPurpose_Id-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")
	public WebElement carPurposeDropdown;
	
	@FindBy(xpath="//a[contains(text(),'Private use')]")
	public WebElement carPurposeOption;
	
	@FindBy(xpath="//input[@id='tocBox']")
	public WebElement TCcheckBox;
	
	@FindBy(xpath="//input[@id='NEXT']")
	public WebElement nextBtn;
	
	
	
	String StartXpath = "//a[contains(text(),'";
	String EndXpath = "')]";
	
	public Car_Insurance_YourCarPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectNewAddress(String add) throws InterruptedException {
		
		AddressDropDown.click();
		addNewAddressOpyion.click();
		 addNewAddressField.sendKeys(add);
		   
		   String[] arrOfStr = add.split(" "); 
		   List<String> list = new ArrayList<String>();
	        for (String a : arrOfStr) {	            
	            list.add(a);
	      }
	        String a1 = list.get(1);
	        String a2 = list.get(2);
	        String a3 = list.get(3);
	        String a4 = list.get(4);
	        String a5 = list.get(5);
	        
	        
	        
	       String start_xpath="//a";
	       String pre = "[contains(text(),'";	      // //a[contains(text(),'3055')] 
		   String last ="')]";
		  
		  
		  System.out.println(start_xpath+pre+a1+last+pre+a2+last+pre+a3+last+pre+a4+last+pre+a5+last);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(start_xpath+pre+a1+last+pre+a2+last+pre+a3+last+pre+a4+last+pre+a5+last))).click();
		
	}
	
	public void searchAndAddNewVehicle(String state, String regoNum) throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(vehicleDropDown)).click();
		
		Thread.sleep(2000L);
		vehicleDropDown.click();
		addAnotherVehicleOption.click();
		
		String stateMidileXpath = state;
		stateDropDown.click();
		System.out.println(StartXpath+stateMidileXpath+EndXpath);		
		WebElement selectState = driver.findElement(By.xpath(StartXpath+stateMidileXpath+EndXpath));
		selectState.click();
		regoTextBox.sendKeys(regoNum);
		findCarBtn.click();		
		Thread.sleep(8000);			
		driver.findElement(By.xpath("//span[@id='VehicleDataId_0']")).click();
		
	}
	
	public Car_Insurance_DriverDetailPage CarOtherDetails() {
		
		
		return new Car_Insurance_DriverDetailPage();
	}
	
	
	
	
	

}
