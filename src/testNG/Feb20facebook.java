package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Feb20facebook {
	WebDriver driver;
	
	@BeforeMethod
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}
	
	
  @Test(dataProvider = "Data")
  public void LoginTc(String U, String P) throws InterruptedException 
  {
	  driver.findElement(By.id("email")).sendKeys(U);
	  driver.findElement(By.id("pass")).sendKeys(P);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(2000);
  }

  //demo d= new demp();
  
  @DataProvider
  public Object[][] Data() 
  {
    return new Object[][]
    {
      {"a" ,"aaaa" },
      { "b" ,"bbb"},
      {"c" ,"ccc"}
    
    };
  }
  
  @AfterMethod
  public void TearDown()
  {
	  driver.close();
  }
}
