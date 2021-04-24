package testNG;

import org.testng.annotations.Test;

public class Feb18MultipleTC {
	
  @Test(priority=1)
  public void Login() {
	  System.out.println("Login Done...");
  }
  
  @Test(priority=2)
  public void Send() {
	  System.out.println("sent Done...");
  }
  
  @Test(priority=3)
  public void Logout() {
	  System.out.println("Logout Done...");
  }
}
