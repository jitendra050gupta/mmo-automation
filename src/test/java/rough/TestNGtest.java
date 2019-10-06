package rough;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGtest {
	
	/*
	@Test(dependsOnMethods = "SecondOrder", priority = 1)
	public void firstOrder() {
		System.out.println("First Order method invoked");
		
		
	}
	
	@Test(priority = 2)
	public void SecondOrder() {
		System.out.println("Second Order method invoked");
		
		
	}
	
	
	
	@Test(priority=3)
	public void thirdOrder() {
		System.out.println("Third Order method invoked");
		
		
	}
	*/
	@Test(priority=1)
	 public void Login() 
	{ 
	  System.out.println("LogIn Test code.");
	  Assert.assertTrue(7>6, "Condition Is False.");
	}

	@Test(priority=1, dependsOnMethods={"Login"}) 
	public void checkMail() 
	{ 
	  System.out.println("checkMail Test code.");
	}

	@Test(priority=1,dependsOnMethods={"Login","checkMail"}) 
	public void logOut() 
	{ 
	  System.out.println("LogOut Test code.");
	}

	
	//Instead of this you can use -'dependsOnGroups' annotation.

	@Test(groups = { "A" })
	   public void login1() 
	  {
	      System.out.println("PrintMessage()");
	  }
	

	@Test(dependsOnGroups = { "A" }) 
	public void LogOut1() 
	{ 
	  System.out.println("LogOut Test code.");
	}
	
	
	
	

}
