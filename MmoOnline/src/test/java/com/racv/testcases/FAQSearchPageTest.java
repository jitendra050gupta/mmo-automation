package com.racv.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.racv.base.TestBase;
import com.racv.pages.DashboardPage;
import com.racv.pages.FAQPage;
import com.racv.pages.LoginPage;

public class FAQSearchPageTest extends TestBase {

	LoginPage loginpage;
	DashboardPage dashboard;
	FAQPage faq;
	
	
	public FAQSearchPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		init();
		loginpage= new LoginPage();
		dashboard = loginpage.doLogin(prop.getProperty("membername"), prop.getProperty("password"));
		faq = dashboard.clickOnHELP();
	}
	
	
	@Test
	public void faqSearchTest() {
		faq.Select_WhatIsMyMembership();
		faq.ClickOnSearch();
		System.out.println(faq.actualSearch_whatIsMyMembership.getText());
		Assert.assertEquals("What is My Membership", faq.actualSearch_whatIsMyMembership.getText());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
