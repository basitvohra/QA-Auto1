package assignment;

import org.testng.annotations.Test;

import testNG.Feb20ReadingElements;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class A1_Google {
	WebDriver driver;
	ReadProps r= new ReadProps();
  @Test
  public void launch_google() throws InterruptedException, IOException {
	  
	  
		System.setProperty(r.getPropValue("chromedrivertype"), r.getPropValue("chromedriverloc"));
		
		 driver = new ChromeDriver();

		driver.get(r.getPropValue("a1link"));
		Thread.sleep(3000);
  }
  @AfterMethod
  public void afterMethod() {
  driver.close();
  }
  

}
