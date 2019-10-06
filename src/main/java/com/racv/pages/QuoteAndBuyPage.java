package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class QuoteAndBuyPage extends TestBase{
	
	@FindBy(xpath="//label[contains(text(),'Car Insurance')]")
	public WebElement carInsuranceLink;
	
	@FindBy(xpath="//label[contains(text(),'Motorcycle Insurance')]")
	public WebElement motorcycleInsuranceLink;
	
	@FindBy(xpath="//span[contains(text(),'Emergency Roadside Assistance')]")
	public WebElement eraLink;
	
	@FindBy(xpath="//label[contains(text(),'Home Insurance')]")
	public WebElement hiLink;
	
	@FindBy(xpath="//span[contains(text(),'Emergency Home Assist')]")
	public WebElement ehaLink;
	
		
	@FindBy(xpath="//span[contains(text(),'Bike Assist')]")
	public WebElement bikeAssistLink;
	
	@FindBy(xpath="//label[contains(text(),'Renters Insurance')]")
	public WebElement rentersInsuranceLink;
	
	
	
	
	public QuoteAndBuyPage() {
		PageFactory.initElements(driver, this);
	}
	

	public ERAProductsPage clickOnERAlink() {
		
		eraLink.click();
		return new ERAProductsPage();
	}
	
    public void clickOnEHAlink() {
		
		ehaLink.click();
	}
    
    public Car_InsuranceProductsPage clickOnCarInsurancelink() {
		
    	carInsuranceLink.click();
    	return new Car_InsuranceProductsPage();
	}
    
    public void clickOnMotorInsurancelink() {
		
    	motorcycleInsuranceLink.click();
	}
    
    public void clickOnHomeInsurancelink() {
		
    	hiLink.click();
	}
   public void clickOnBikeAssistlink() {
		
	   bikeAssistLink.click();
	}
   public void clickOnRentersInsurancelink() {
		
	   rentersInsuranceLink.click();
	}
    
	
}
