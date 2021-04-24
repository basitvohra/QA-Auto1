package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Brwserselection {
	static WebDriver driver;

	public static WebDriver Launch(String browser ,  String url) {
		  
		  if(browser.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "F:\\bhagya-grid\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		  }
		  else if(browser.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "F:\\bhagya-grid\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		  }
		  else if(browser.equals("Ie"))
		  {
			  System.setProperty("webdriver.ie.driver", "F:\\bhagya-grid\\Drivers\\geckodriver.exe");
			 driver = new InternetExplorerDriver();
		  }
		  driver.get(url);
		return driver;
			
		  }
	
}
