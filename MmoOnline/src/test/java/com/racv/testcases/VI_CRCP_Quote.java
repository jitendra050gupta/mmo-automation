package com.racv.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.racv.base.TestBase;
import com.racv.pages.Car_InsuranceProductsPage;
import com.racv.pages.Car_Insurance_YourCarPage;
import com.racv.pages.DashboardPage;
import com.racv.pages.LoginPage;
import com.racv.pages.QuoteAndBuyPage;

public class VI_CRCP_Quote extends TestBase {
	
	LoginPage loginpage;
	DashboardPage dashboard;
    QuoteAndBuyPage quoteAndBuy;
    Car_InsuranceProductsPage carInsuranceProducts;
    Car_Insurance_YourCarPage yourCarPage;
	
    
    
    public VI_CRCP_Quote() {
		super();
    }
    
    @BeforeMethod(enabled=false)
	public void setup() throws InterruptedException {
		init();
		loginpage = new LoginPage();
		dashboard = loginpage.doLogin(prop.getProperty("membername"), prop.getProperty("password"));
		quoteAndBuy = dashboard.clickOnQuoteAndBuy();
		carInsuranceProducts = quoteAndBuy.clickOnCarInsurancelink();
		yourCarPage = carInsuranceProducts.clickOnGetQuote_CRCP();
	}
	
	@Test(enabled=false)
	public void eraPruchaseTest() throws InterruptedException {

		yourCarPage.selectNewAddress("11 Jolley Street, BRUNSWICK WEST VIC 3055");
		yourCarPage.searchAndAddNewVehicle(prop.getProperty("state_VI_CRCP"), prop.getProperty("VehicleRego_CRCP"));

		yourCarPage.CarOtherDetails();
	}
	
	@AfterMethod(enabled=false)
	public void tearDown() {
		//driver.quit();
	}
	

}
