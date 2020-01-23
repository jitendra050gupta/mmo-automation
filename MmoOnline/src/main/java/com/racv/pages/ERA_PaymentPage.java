package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;
import com.racv.util.TestUtil;

public class ERA_PaymentPage extends TestBase{

	@FindBy(xpath="//input[@value='ACTIVATE NOW']")
	public WebElement activateNowBtn;
	
	@FindBy(xpath="//input[@value='Back']")
	public WebElement backBtn;
	
	@FindBy(xpath="//div[@id='finalPrice']")
	public WebElement finalPrice;
	
	@FindBy(xpath="//input[@id='CreditCard']")
	public WebElement creditCardRadioBtn;
	
	@FindBy(xpath="//input[@id='PayPal']")
	public WebElement payPalRadioBtn;
	
	@FindBy(xpath="//input[@id='paymentSubmit']")

	public WebElement payNowBtn;
	
	
	
	public ERA_PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	
	public ERA_ConfirmationPage doPayment_ERA() {
		System.out.println(finalPrice.getText());
		
		if (finalPrice.getText().equals("$0.00"))
		{
		activateNowBtn.click();
			return 	new ERA_ConfirmationPage();
		}
		else {
			creditCardRadioBtn.click();
			TestUtil.creditCardPayment();
			payNowBtn.click();			
			return 	new ERA_ConfirmationPage();
		}
		
			
			
	}
	
}
