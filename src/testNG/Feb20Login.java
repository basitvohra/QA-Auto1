package testNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb20Login {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		Feb20ReadingElements r= new Feb20ReadingElements();
		
	WebElement Unm	= r.getWebElementReference("UserName", driver);
	Unm.sendKeys("aaaaa");

	r.getWebElementReference("Password", driver).sendKeys("test");
	
	r.getWebElementReference("Log", driver).click();
	}

}
