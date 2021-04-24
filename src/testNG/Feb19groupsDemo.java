package testNG;

import org.testng.annotations.Test;

public class Feb19groupsDemo {
	
  @Test(groups= {"smoke"})
  public void A() {
	  System.out.println("A done..");
  }
  
  @Test(groups= {"smoke","fun"})
  public void B() {
	  System.out.println("B done..");
  }
  
  @Test(groups= {"fun"})
  public void C() {
	  System.out.println("C done..");
  }
  
  @Test(groups= {"Reg"})
  public void D() {
	  System.out.println("D done..");
  }
  
  @Test(groups= {"smoke","Reg"})
  public void E() {
	  System.out.println("E done..");
  }
  
  @Test(groups= {"fun" , "Reg"})
  public void F() {
	  System.out.println("F done..");
  }
}
