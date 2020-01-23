package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class ERA_ConfirmationPage extends TestBase{
	
	@FindBy(xpath="//ul[@id='old_top_menu']//a[contains(text(),'My Membership')]")
	public WebElement myMembershipBtn;
	
	
	public ERA_ConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public DashboardPage goOnDashboard() {
		
		myMembershipBtn.click();
		
		return new DashboardPage();
	}

}
