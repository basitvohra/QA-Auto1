package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Feb20sample {
	
  @Test(dataProvider = "Data")
  public void GoogleTc(Integer n, String s, String s1) 
  {
	  System.out.println(n + "  " +s + " " +s1);
  }

  //demo d= new demp();
  
  @DataProvider
  public Object[][] Data() 
  {
    return new Object[][]
    {
      { 1, "a" ,"aaaa" },
      { 2, "b" ,"bbb"},
      { 3, "c" ,"ccc"},
      { 4, "ddd" ,"d"}
    };
  }
  
  @Test(dataProvider = "info")
  public void GoogleTc2(Integer n) 
  {
	  System.out.println(n);
  }
  @DataProvider
  public Object[][] info() 
  {
    return new Object[][]
    {
      { 1 },
      { 2},
      { 3}
     
    };
  }
  
}
