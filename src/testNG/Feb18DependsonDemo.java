package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Feb18DependsonDemo {
	
  @Test(priority=1)
  public void Login() {
	  System.out.println("Login Done...");
	  Assert.assertEquals(10, 10);
  }
  
  @Test(priority=2 , dependsOnMethods= {"Login"})
  public void Send() {
	  System.out.println("sent Done...");
	  Assert.assertEquals("a","a");
  }
  
 // @Test(priority=3, dependsOnMethods= {"Login"})
 // @Test(priority=3, dependsOnMethods= {"Login"} , alwaysRun=true)
  
  @Test(priority=3, dependsOnMethods= {"Login","Send"})
  public void Logout() {
	  System.out.println("Logout Done...");
	  Assert.assertEquals("aaa","aaa");
  }
}
