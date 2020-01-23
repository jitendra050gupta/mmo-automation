package DataProviderTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.out.println("Before Method 'SetUp method' is invoked");
	}

	@Test(dataProvider = "credentials")
	public void dataProviderTest(String userName, String password) throws InterruptedException {
		System.out.println("UsrName is:: " + userName + " and password is:: " + password);
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("TearDown method is invoked");
	}

	@DataProvider(parallel=true,indices = {0,1,4,5})   //indices values don't cause any exceptions
	public Object credentials() {
		Object obj[][] = new Object[5][2];

		// First row data
		obj[0][0] = "test1@test.com";
		obj[0][1] = "test12345";

		// Second row data
		obj[1][0] = "test2@test.com";
		obj[1][1] = "test123456";

		// Third row data
		obj[2][0] = "test3@test.com";
		obj[2][1] = "test1234567";

		// Third row data
		obj[3][0] = "test4@test.com";
		obj[3][1] = "test12345678";
		
		// Third row data
		obj[4][0] = "test5@test.com";
		obj[4][1] = "test12345679";

		return obj;
	}

}
