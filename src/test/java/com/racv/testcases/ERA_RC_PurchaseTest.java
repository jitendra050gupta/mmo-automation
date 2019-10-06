package com.racv.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.racv.base.TestBase;
import com.racv.pages.DashboardPage;
import com.racv.pages.ERAProductsPage;
import com.racv.pages.ERA_ConfirmationPage;
import com.racv.pages.ERA_PaymentPage;
import com.racv.pages.ERA_SummaryPage;
import com.racv.pages.ERA_VehicleDetailPage;
import com.racv.pages.LoginPage;
import com.racv.pages.QuoteAndBuyPage;

public class ERA_RC_PurchaseTest extends TestBase{
	LoginPage loginpage;
	DashboardPage dashboard;
    QuoteAndBuyPage quoteAndBuy;
    ERAProductsPage eraProducts;
    ERA_VehicleDetailPage eraRCvehicleDetails;
    ERA_SummaryPage eraSummary;
    ERA_PaymentPage payment;
    ERA_ConfirmationPage confirmation;
    
	
	public ERA_RC_PurchaseTest() {
		super();
	}
	
	
	@BeforeMethod()
	public void setup() throws InterruptedException {
		init();
		loginpage= new LoginPage();
		dashboard =  loginpage.doLogin(prop.getProperty("membername"), prop.getProperty("password"));
		quoteAndBuy =  dashboard.clickOnQuoteAndBuy();
		eraProducts = quoteAndBuy.clickOnERAlink();
		eraRCvehicleDetails= eraProducts.clickOnERA_RC_BuyNowlink();
        eraRCvehicleDetails.seletVelicleByRego(prop.getProperty("stateRC"), prop.getProperty("eraVehicleRegoRC"));		
        eraSummary = eraRCvehicleDetails.clickNext();
        payment = eraSummary.perchaseNow();
        confirmation = payment.doPayment_ERA();
	}
	
	@Test()
	public void eraPruchaseTest() throws InterruptedException {
		
		System.out.println("OK");
		confirmation.goOnDashboard();
	}
	
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
