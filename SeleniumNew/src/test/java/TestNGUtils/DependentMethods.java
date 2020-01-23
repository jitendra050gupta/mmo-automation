package TestNGUtils;

import org.testng.annotations.Test;

public class DependentMethods {
	
	@Test(priority = 1, groups = "high")
	public void registrationTest() {
		System.out.println("Registration test");
	}
	
	@Test(priority = 0, dependsOnMethods = "registrationTest" , groups = "medium")
	public void logInTest() {
		
		System.out.println("Login Test");
	}
	
	@Test(priority = 2, groups = "low", dependsOnMethods = "logInTest")
	public void homePage() {
		System.out.println("Home Page Tested");
	}
	
	
	

}
