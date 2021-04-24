package assignment;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class A3_Oracle {
	WebDriver driver;

	@Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		 driver = new ChromeDriver();
//			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

		WebDriverWait w= new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
//		driver.findElement(By.name("email")).sendKeys("FirstName.LastName@gmail.com");
		Thread.sleep(2000);
		WebElement Pwd	= driver.findElement(By.name("email"));
		Pwd.sendKeys("FirstName.LastName@gmail.com");
		
		
		driver.findElement(By.name("password")).sendKeys("Testis1t");
		driver.findElement(By.name("retypePassword")).sendKeys("Testis1t");
		Select m = new Select (driver.findElement(By.xpath("//select[@id='country::content']")));
		m.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);

		driver.findElement(By.id("firstName::content")).sendKeys("Joeseph");
		driver.findElement(By.id("lastName::content")).sendKeys("Torched");
		driver.findElement(By.name("jobTitle")).sendKeys("Sr Analyst");
		driver.findElement(By.name("workPhone")).sendKeys("9524523333");
		driver.findElement(By.name("companyName")).sendKeys("ABC Consulting");
		driver.findElement(By.name("address1")).sendKeys("123 XYZ Road");
		driver.findElement(By.name("city")).sendKeys("London");
		driver.findElement(By.name("postalCode")).sendKeys("DSS567");
		driver.findElement(By.id("subscription1")).click();
		driver.findElement(By.id("cb1")).click();
		Thread.sleep(5000);

		
	}
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
