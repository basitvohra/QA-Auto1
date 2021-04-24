package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb10webAlertDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("corover-close-btn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		Thread.sleep(2000);
		String txt= driver.switchTo().alert().getText();
		
		Thread.sleep(2000);
		System.out.println("Actual Text : " + txt);
		
		if(txt.equals("Please select start place."))
		{
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Invalid Alert...");
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
		}
		

	}

}
