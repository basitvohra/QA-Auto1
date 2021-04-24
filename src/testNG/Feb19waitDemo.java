package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb19waitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		

	WebElement Unm = driver.findElement(By.name("userName"));
	Unm.sendKeys("mercury");
	
	WebElement Pwd = driver.findElement(By.name("password"));
	Pwd.sendKeys("mercury");
	
	WebElement signin = driver.findElement(By.name("submit"));
	signin.click();
	}

}
