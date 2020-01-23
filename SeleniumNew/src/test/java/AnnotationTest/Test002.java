package AnnotationTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test002 {
	@BeforeSuite
	public void beforeSuite002() {
		System.out.println("Before Suite Method from Test002 Class");
	}
	@BeforeTest
	public void beforeTest002() {
		System.out.println("Before Test from Test002 Class");
	}
	@BeforeClass
	public void beforeClass002() {
		System.out.println("Before Class Method from Test002 Class");
	}
	@BeforeMethod
	public void beforeMethod002() {
		System.out.println("Before a Method from Test002 Class");
	}
	
	@Test
	public void testMethod002() {
		System.out.println("Test Method from Test002 Class");
	}
	

}
