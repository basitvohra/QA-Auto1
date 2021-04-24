package qa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb10windowHandel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String MainID =driver.getWindowHandle();
		System.out.println("window id Parent : " + MainID);
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("privacy-link")).click();
		driver.switchTo().window(MainID);
		
		driver.findElement(By.id("cookie-use-link")).click();

		//============================
		
		Set<String> allWin = driver.getWindowHandles();
		int cnt = allWin.size();
		System.out.println("Window count : " + cnt);
		
		for( String   x : allWin) // P , c1, c2
		{
			if(x.equals(MainID))
			{
				driver.switchTo().window(x);
				System.out.println("Parent : " + driver.getTitle());
				Thread.sleep(2000);
			}
			else
			{
				driver.switchTo().window(x);
				System.out.println("child : " + driver.getCurrentUrl());
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(MainID);
		
	}

}
