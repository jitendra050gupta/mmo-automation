package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class FAQPage extends TestBase {

	@FindBy(xpath="//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")
	public WebElement faqTopic;
	
	@FindBy(xpath="//a[contains(text(),'What is My Membership')]")
	public WebElement whatIsMyMembership;
	
	@FindBy(xpath="//h3[@class='membershipHeading']")
	public WebElement actualSearch_whatIsMyMembership;
	
	@FindBy(xpath="//a[contains(text(),'Motor Insurance')]")
	public WebElement motorInsurance;
	
	@FindBy(xpath="//a[contains(text(),'Travel Insurance')]")
	public WebElement travelInsurance;
	
	@FindBy(xpath="//a[@tabindex='-1'][contains(text(),'Emergency Home Assist')]")
	public WebElement emergencyHomeAssist;
	
	@FindBy(xpath="//input[@id='searchSubmit']")
	public WebElement searchButton;
	
	
	public FAQPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Select_WhatIsMyMembership(){
		faqTopic.click();
		whatIsMyMembership.click();
		
	}
	
	public void Select_TravelInsurance(){
		faqTopic.click();
		travelInsurance.click();
	}
	
	public void Select_EmergencyHomeAssist(){
		faqTopic.click();
		emergencyHomeAssist.click();
		
	}
	
	
	public void Select_MotorInsurance(){
		faqTopic.click();
		motorInsurance.click();
	}
	
	
	
	
	
	
	public void ClickOnSearch() {
		searchButton.click();
	}
	
	
	
	
	
	
	
}
