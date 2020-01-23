package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class ERA_SummaryPage extends TestBase  {
	
	
	@FindBy(xpath="//div[@class='product_subheader_b']//div[@id='editPersonlInfoBtn_2']//input[@value='Edit']")
	public WebElement vehicleEdit;
	
	@FindBy(xpath="//input[@value='PURCHASE NOW']")
	public WebElement purchaseNow;
	
	
	public ERA_SummaryPage() {
		PageFactory.initElements(driver, this);
	}

	
	public ERA_PaymentPage perchaseNow() {
		purchaseNow.click();
			return 	new ERA_PaymentPage();
	}
}
