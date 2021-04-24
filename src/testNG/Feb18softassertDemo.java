package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Feb18softassertDemo {
	
  @Test
  public void display() 
  {
	  System.out.println("TC done...");
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		
		SoftAssert s= new SoftAssert();
		WebElement Pwd= driver.findElement(By.id("pass"));
		
		boolean status= Pwd.isDisplayed();
		s.assertTrue(status);
		
		s.assertEquals(driver.getTitle(), "Facebook ");
		
		
		driver.findElement(By.id("email")).sendKeys("a1@gmail.com");
		

		
		Pwd.sendKeys("test");
		
		s.assertAll();
		
  }
  
 
  
}
