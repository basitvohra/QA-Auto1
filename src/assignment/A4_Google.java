package assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class A4_Google {
	WebDriver driver;
	  
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		driver = new ChromeDriver();
		  
	  }
	
	@Test
  public void f() throws InterruptedException {
		driver.get("https://www.google.com/in");
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
