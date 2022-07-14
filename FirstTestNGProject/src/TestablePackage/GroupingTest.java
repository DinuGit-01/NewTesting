package TestablePackage;

import org.testng.annotations.Test;

public class GroupingTest {
	  @Test(groups= {"tester"})
  public void Sanitytest() {
		  
		  System.out.println("verify the basic and critical functionality without goin deep");
		  
		  
  }
	  @Test(groups= {"tester"})
	public void UnitTest() {
		  System.out.println("test single module or code by the devloper");
	  }
	  
	  

	  @Test(groups= {"tester"})
	public void IntegatTest() {
		  System.out.println("test more than two module or code by the tester");
	  }
	  @Test(groups= {"Oops"})
	  public void Inheritance() {
		  System.out.println("two class Is A-relationShip");
	  }
	  
	  @Test(groups= {"Oops"})
	  public void Absraction() {
		  System.out.println("Achived by the Interface and abstract class");
	  }
	  
	  
	  
}
