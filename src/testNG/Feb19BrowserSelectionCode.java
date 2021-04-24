package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Feb19BrowserSelectionCode {
	WebDriver driver ;
	
	@Parameters({"browser" , "url"})
  @Test
  public void Launch(String browser ,  String url) {
	  
	  switch(browser)
	  {
	  case "chrome":
		  System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		 driver = new ChromeDriver();
		 break;
	  case "firefox":
		  System.setProperty("webdriver.gecko.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		driver = new FirefoxDriver();
		 break;
	  case "ie":
		  System.setProperty("webdriver.ie.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		 driver = new InternetExplorerDriver();
		 break;
	default :
		System.out.println("Unkonwn Browser....");
		
	  }
	  
	  driver.get(url);
	  
  }
}
