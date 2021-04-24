package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Feb18sample {
	
  @Test
  public void display() 
  {
	  System.out.println("TC done...");
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		
		
		driver.findElement(By.id("email")).sendKeys("a1@gmail.com");
		
		WebElement Pwd= driver.findElement(By.id("pass"));
		
		boolean status= Pwd.isDisplayed();
		Assert.assertTrue(status);
		
		Pwd.sendKeys("test");
		
  }
  
 
  
}
