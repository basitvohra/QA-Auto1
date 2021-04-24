package qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb11waitdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	WebElement Um	= driver.findElement(By.name("userName"));
	Um.sendKeys("mercury");
	
	WebElement Pwd	= driver.findElement(By.name("password123"));
	Pwd.sendKeys("mercury");
		
	WebElement submit	= driver.findElement(By.name("submit"));
	submit.click();
	

	}

}
