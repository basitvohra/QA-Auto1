package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Feb19App2 {
	WebDriver driver;
	
	@Test(priority=1)
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		driver = new ChromeDriver();
		 
	}
	
	@Test(priority=3)
	public void LoginFacebook()
	{
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	
		driver.findElement(By.id("email")).sendKeys("aaaa");
		
	}

	@Test(priority=2)
	public void ForgetFacebook()
	{
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
	
		driver.findElement(By.linkText("Forgot Password?")).click();
		
	}
}
