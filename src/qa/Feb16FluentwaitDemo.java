package qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Feb16FluentwaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\bhagya-grid\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		
		//driver.manage().window().maximize();
		
		
		driver.findElement(By.id("corover-close-btn")).click();
		
		//WebDriverWait w= new WebDriverWait(driver , 4);
		FluentWait w= new FluentWait(driver).withTimeout(4,  TimeUnit.SECONDS).pollingEvery(3, TimeUnit.NANOSECONDS);
		
		w.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[contains(text(),'Search for Bus')]"), 2));
		WebElement ele1 = driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]"));
		
		ele1.click();
		
//		Thread.sleep(2000);
//		ele1.click();
//		Thread.sleep(2000);
//		try
//		{
//			driver.switchTo().alert();
//			
//		String txt = driver.switchTo().alert().getText();
//			System.out.println(txt);
//			
//			if(txt.matches("Please select start place."))
//			{
//				driver.switchTo().alert().accept();
//			}
//			else
//			{
//				System.out.println("Invalid allert...");
//			}
//			
//		}catch(NoAlertPresentException e)
//		{
//			e.printStackTrace();
//		}
//		
//		
		
	}

}
