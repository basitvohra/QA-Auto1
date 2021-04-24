package testNG;

import org.testng.annotations.Test;

public class Feb19ParallelDemo {
	
  @Test
  public void A() {
	long Tid =  Thread.currentThread().getId();
	  System.out.println("A done.." + Tid);
  }
  
  @Test
  public void B() {
	  long Tid =  Thread.currentThread().getId();
	  System.out.println("B done.." + Tid);
  }
  
  @Test
  public void C() {
	  long Tid =  Thread.currentThread().getId();
	  System.out.println("C done.." + Tid);
  }
  
  @Test
  public void D() {
	  long Tid =  Thread.currentThread().getId();
	  System.out.println("D done.." + Tid);
  }
  
  @Test
  public void E() {
	  long Tid =  Thread.currentThread().getId();
	  System.out.println("E done.." + Tid);
  }
  
  @Test
  public void F() {
	  long Tid =  Thread.currentThread().getId();
	  System.out.println("F done.." + Tid);
  }
}
