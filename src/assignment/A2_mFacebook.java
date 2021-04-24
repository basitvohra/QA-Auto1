package assignment;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class A2_mFacebook {
	WebDriver driver;

	
  @Test
  public void f() throws InterruptedException {
		System.setProperty("geckodrivertype", "geckodriverloc");
		
		 driver = new FirefoxDriver();

		driver.get(" https://m.facebook.com");
		driver.findElement(By.id("signup-button")).click();
		driver.findElement(By.id("firstname_input")).sendKeys("FirstName");
		driver.findElement(By.id("lastname_input")).sendKeys("LastName");
		driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();
		Select m = new Select (driver.findElement(By.id("month")));
		m.selectByVisibleText("Dec");
		Select d = new Select (driver.findElement(By.id("day")));
		d.selectByVisibleText("5");
		Select y = new Select (driver.findElement(By.id("year")));
		y.selectByVisibleText("1980");
		driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();
		driver.findElement(By.id("contactpoint_step_input")).sendKeys("9524524522");
		driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();
        driver.findElement(By.id("Male")).click();							
		driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();
		driver.findElement(By.id("password_step_input")).sendKeys("TESTPASSword123");
		driver.findElement(By.xpath("//div[9]/div[2]/button[4]")).click();
//		for(WebElement x : allEle)  // F , M, C
//		{
//			String txt= x.getText();
//			System.out.println(txt);
//			
//			if(txt.equals("Male"))
//			{
//				if(!x.isSelected())
//				{
//					x.click();
//					break;
//				}
//			}
//		}
//		
		//driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();

//		for(int i =0; i< m.getSize() ;i++) {
//			m.get(i).getText();
//		}
//		


		Thread.sleep(1000);

	  
  }
  @AfterMethod
  public void afterMethod() {
  driver.close();
  }


}
