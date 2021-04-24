package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Feb19Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
	WebDriverWait w= new WebDriverWait(driver , 4);
		
	w.until(ExpectedConditions.numberOfElementsToBe(By.name("userName"), 1));
	
	WebElement Unm = driver.findElement(By.name("userName"));
	Unm.sendKeys("mercury");
	
	w.until(ExpectedConditions.presenceOfElementLocated(By.name("password1")));
	
	WebElement Pwd = driver.findElement(By.name("password1"));
	Pwd.sendKeys("mercury");
	
	WebElement signin = driver.findElement(By.name("submit"));
	signin.click();
	}

}
