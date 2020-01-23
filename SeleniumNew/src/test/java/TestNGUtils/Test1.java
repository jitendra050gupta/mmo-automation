package TestNGUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	 @Test
	 public void Test01()
	 {
	 Assert.assertEquals(true, true);
	 }
	 
	 @Test
	 public void Test02()
	 {
	 Assert.assertEquals(false, true);
	 }

}
