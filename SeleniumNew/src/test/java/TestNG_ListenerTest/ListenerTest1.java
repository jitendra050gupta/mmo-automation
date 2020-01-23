package TestNG_ListenerTest;



import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest1 {
	
	@Test
	public void test001() {
		System.out.println(" Test methos 001");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = "test003")
	public void test002() {
		System.out.println(" Test methos 002");
		
	}
	
	@Test 
	public void test003() {
		System.out.println(" Test methos 003");
		Assert.fail();
	}
	
	@Test
	public void test004() {
		System.out.println(" Test methos 004");
	}

}
