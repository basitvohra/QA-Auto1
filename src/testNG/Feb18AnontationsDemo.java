package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Feb18AnontationsDemo {
	
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("suite started......");
	  }
	  
	@BeforeClass
	  public void beforeClass() {
		 System.out.println("beforeClass done...");
	  }
	
	 @BeforeTest
	  public void beforeTest() {
		 System.out.println("beforeTest done...");
	  }
	 
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod done...");
	  }
	
	
  @Test
  public void Display() {
	  
	  System.out.println("TC1 started,...");
  }
  
  @Test
  public void Display2() {
	  
	  System.out.println("TC2 started,...");
  }

  
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod done...");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass done...");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest done...");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite done...");
  }

}
