package AnnotationTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test001 {
	
	@BeforeSuite
	public void beforeSuite001() {
		System.out.println("Before Suite Method from Test001 Class");
	}
	@BeforeTest
	public void beforeTest001() {
		System.out.println("Before Test from Test001 Class");
	}
	@BeforeClass
	public void beforeClass001() {
		System.out.println("Before Class Method from Test001 Class");
	}
	@BeforeMethod
	public void beforeMethod001() {
		System.out.println("Before a Method from Test001 Class");
	}
	
	@Test
	public void testMethod001() {
		System.out.println("Test Method from Test001 Class");
		Assert.assertTrue(true, "TestMethod001 has been failed");
	}
	
	
	

}
