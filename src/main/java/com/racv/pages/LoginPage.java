package com.racv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.racv.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory--- OR
	
	@FindBy(xpath="//input[@id='login-username-input'][@name='userMemberNo']")
	public WebElement memberId;
	
	@FindBy(xpath="//input[@id='login-password-input']")
	public WebElement password;
	
	@FindBy(xpath="//input[contains(@value,'Login')]")
	public WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public DashboardPage doLogin( String un, String pass ) {
		
		memberId.sendKeys(un);
		password.sendKeys(pass);
		login.click();
		return new DashboardPage();
	}
	
	
}
