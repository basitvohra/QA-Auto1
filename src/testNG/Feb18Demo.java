package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Feb18Demo {
	
  @Test
  public void f() {
	  System.out.println("2nd TC");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("2nd TC befor Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("2nd TC After Test");
  }

}
