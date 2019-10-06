package com.racv.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.racv.base.TestBase;
import com.racv.pages.DashboardPage;
import com.racv.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	DashboardPage dashboard;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		init();
		loginpage= new LoginPage();		
	}
	
	
	@Test
	public void loginTest() {
		dashboard = loginpage.doLogin(prop.getProperty("membername"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
