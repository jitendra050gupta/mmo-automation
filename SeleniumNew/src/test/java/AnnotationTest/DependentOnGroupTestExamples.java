package AnnotationTest;

import org.testng.annotations.Test;

public class DependentOnGroupTestExamples {
	@Test(dependsOnGroups = { "High" }, groups="Critical")
    public void groupTestOne() {
        System.out.println("Group Test method one");
    }
 
    @Test(groups = { "Low" })
    public void groupTestTwo() {
        System.out.println("Group test method two");
    }
 
    @Test(groups = { "High" })
    public void groupTestThree() {
        System.out.println("Group Test method three");
    }

}
