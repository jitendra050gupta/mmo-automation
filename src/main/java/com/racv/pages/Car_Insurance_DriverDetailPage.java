package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class Car_Insurance_DriverDetailPage extends TestBase {
	
	@FindBy(xpath="//div[17]//div[2]//div[3]//div[1]//a[1]")
	public WebElement CRTP_Link; // Get a Quote web element for third party property damage car insurance
	
	
	public Car_Insurance_DriverDetailPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	

}
