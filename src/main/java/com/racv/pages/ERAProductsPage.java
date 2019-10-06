package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class ERAProductsPage extends TestBase{
	
	@FindBy(xpath="//div[@id='buyLink_RC']//div[@class='yellow-plain-button-lt']//a[@href='javascript:void(0);'][contains(text(),'BUY NOW')]")
	public WebElement eraRCLink;
	
	@FindBy(xpath="//div[@id='buyLink_EC']//div[@class='yellow-plain-button-lt']//a[@href='javascript:void(0);'][contains(text(),'BUY NOW')]")
	public WebElement eraECLink;
	
	@FindBy(xpath="//div[@id='buyLink_TC']//div[@class='yellow-plain-button-lt']//a[@href='javascript:void(0);'][contains(text(),'BUY NOW')]")
	public WebElement eraTCLink;
	
	@FindBy(xpath="//span[contains(text(),'view full comparison table')]")
	public WebElement viewFullComparisonTableLink;
	
	
	
	public ERAProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
    public void clickOnviewFullComparisonTableLink() {
		
		eraRCLink.click();
		viewFullComparisonTableLink.click();
	}
    
	public ERA_VehicleDetailPage clickOnERA_RC_BuyNowlink() {
		
		eraRCLink.click();
		return new ERA_VehicleDetailPage();
	}
	
    public ERA_VehicleDetailPage clickOnERA_TC_BuyNowlink() {
		
		eraTCLink.click();
		return new ERA_VehicleDetailPage();
	}
    public ERA_VehicleDetailPage clickOnERA_EC_BuyNowlink() {
		
		eraECLink.click();
		return new ERA_VehicleDetailPage();
	}
	
		
	}
