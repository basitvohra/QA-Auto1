package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\imp--dont delete\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement unm= driver.findElement(By.id("email"));
		unm.sendKeys("user1");
		
		
		// driver.findElement(By.id("email")).sendKeys("aaa");
		
		WebElement Pwd = driver.findElement(By.id("pass"));
		Pwd.sendKeys("Test");
		Thread.sleep(1000);
		
		Pwd.clear();
		Thread.sleep(1000);
		
		Pwd.sendKeys("welcome");
		
		WebElement Log = driver.findElement(By.name("login"));
		Log.click();

	}

}
