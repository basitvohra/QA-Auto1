package assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class A6_Selenium {
	WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Downloads")).click();
		driver.findElement(By.id("browsersExpand")).click();
		driver.findElement(By.xpath("//div[@id='browsersContent']/p[5]/a[1]")).click();
		Thread.sleep(2);
		
		
  }
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
