package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Feb18AssertionDemo {
	
  @Test
  public void Tc() {
	  
	  String s1="Java";
	  String s2="java";
	  
	  System.out.println("started...");
	  
	//  Assert.assertEquals(s1, s2, "input mismatch");
	  
	 // Assert.assertFalse(10 == 20);
	  
	  Assert.assertTrue(10 == 20 , "Invaid number");
	  
	  System.out.println("ended......");
  }
  
}
