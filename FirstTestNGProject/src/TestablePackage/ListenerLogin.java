package TestablePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerLogin {
  @Test
  public void LoginByEmail() {
	  System.out.println("Log in by email");
	  Assert.assertEquals("Dinesh", "Dinesh");
	  
	  
	  
	  
  }
  @Test
  public void Loginfacebbok() {
	  System.out.println("Log in by facebbok");
	  Assert.assertEquals("Dinesh", "Dines");
	  
	  
	  
	  
  }
}
