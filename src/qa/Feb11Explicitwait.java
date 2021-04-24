package qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Feb11Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebDriverWait w= new WebDriverWait(driver, 5);
		
	WebElement Um	= driver.findElement(By.name("userName"));
	Um.sendKeys("mercury");
	
	
//	w.until(ExpectedConditions.presenceOfElementLocated(By.name("password123")));
//	
//	WebElement Pwd	= driver.findElement(By.name("password123"));
//	Pwd.sendKeys("mercury");
		
	//==================
w.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
	
	WebElement Pwd	= driver.findElement(By.name("password"));
	Pwd.sendKeys("mercury");
	
	w.until(ExpectedConditions.numberOfElementsToBe(By.name("submit"), 5));
	
	WebElement submit	= driver.findElement(By.name("submit"));
	submit.click();
	

	}

}
