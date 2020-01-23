package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class Car_InsuranceProductsPage extends TestBase {
	
	@FindBy(xpath="//div[7]//div[2]//div[3]//div[1]//a[1]")
	public WebElement CRCC_Link; // Get a Quote web element for complete care car insurance 
	
	@FindBy(xpath="//div[10]//div[2]//div[3]//div[1]//a[1]")
	public WebElement CRCP_Link; // Get a Quote web element for comprehensive car insurance 
	
	@FindBy(xpath="//div[14]//div[2]//div[3]//div[1]//a[1]")
	public WebElement CRFT_Link; // Get a Quote web element for third party fire and theft car insurance
	
	@FindBy(xpath="//div[17]//div[2]//div[3]//div[1]//a[1]")
	public WebElement CRTP_Link; // Get a Quote web element for third party property damage car insurance
	
	
	public Car_InsuranceProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
      public Car_Insurance_YourCarPage clickOnGetQuote_CRCC() {
		
    	  CRCC_Link.click();
		return new Car_Insurance_YourCarPage();
	}
      
      
      public Car_Insurance_YourCarPage clickOnGetQuote_CRCP() {
  		
    	  CRCP_Link.click();
		return new Car_Insurance_YourCarPage();
	}
      
      
      public Car_Insurance_YourCarPage clickOnGetQuote_CRFT() {
    		
    	  CRFT_Link.click();
		return new Car_Insurance_YourCarPage();
	}
      
      public Car_Insurance_YourCarPage clickOnGetQuote_CRTP() {
  		
    	  CRTP_Link.click();
		return new Car_Insurance_YourCarPage();
	}

      
      
      
      
}
