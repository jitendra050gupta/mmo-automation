package com.racv.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class DashboardPage extends TestBase {
	
	@FindBy(xpath="//ul[@id='old_top_menu']//a[contains(text(),'Help')]")
	public WebElement helpButton;
	
	@FindBy(xpath="//ul[@id='old_top_menu']//a[contains(text(),'Quote & Buy')]")
	public WebElement quoteAndBuy_button;
	
	@FindBy(xpath="//span[@id='memberNumber']")
	public WebElement memberId;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
      public FAQPage clickOnHELP() {
    	  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", helpButton);
	     
		return new FAQPage();
	}
      public QuoteAndBuyPage clickOnQuoteAndBuy() {	
    	  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", quoteAndBuy_button);
    	  
 		return new QuoteAndBuyPage();
 	}
      
      public String MemberId() {
    	 return  memberId.getText();
      }

}
