package qa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb10windowAlert {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Robot r = new Robot();
		
		driver.findElement(By.name("q")).sendKeys("download java");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		r.delay(2000);
		
		driver.findElement(By.xpath("//span[text()='JDK 15.0.2 GA Release - Java (JDK) - Java.net']")).click();
		r.delay(2000);
		
		driver.findElement(By.linkText("Java SE 11")).click();
		
		driver.findElement(By.linkText("Windows/x64 Java Development Kit")).click();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(2000);

		r.keyPress(KeyEvent.VK_TAB);
		r.delay(2000);

		r.keyPress(KeyEvent.VK_TAB);
		r.delay(2000);
		
		r.keyRelease(KeyEvent.VK_TAB);
		r.delay(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(2000);

		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(2000);
		
		
	}

}
