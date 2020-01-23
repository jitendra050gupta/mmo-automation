package AnnotationTest;

import org.testng.annotations.Test;

@Test(groups = { "G1" })
public class GroupClassA {

	// Note here I am not writing @Test as it will inherited from class level.
	// Group information will also be inherited
	public void G1Method1() {
		System.out.println("G1Method1");
	}

	// Note here I am not writing @Test as it will inherited from class level.
	// Group information will also be inherited
	public void G1Method2() {
		System.out.println("G1Method2");
	}

	// Note here I am not writing @Test as it will inherited from class level.
	// Group information will also be inherited
	@Test(groups = "G2")
	public void G1Method3() {
		System.out.println("G1Method3");
	}

}
