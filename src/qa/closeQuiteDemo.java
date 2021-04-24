package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class closeQuiteDemo {

	@Test
	public void testlogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\imp--dont delete\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		//driver.findElement(By.linkText("Create New Account")).click();
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
//		Thread.sleep(2000);
//		
//		//driver.findElement(By.name("firstname")).sendKeys("aaaa");
//		
//	WebElement Fnm=	driver.findElement(By.name("firstname"));
//	boolean s1 = Fnm.isDisplayed();
//	if(s1)
//	{
//		System.out.println("Feild is present..");
//		Fnm.sendKeys("aaaa");
//	}
//		
//	else
//	{
//		System.out.println("Invalid Feild....");
//	}
//		
//		
//		
//		driver.findElement(By.id("cookie-use-link")).click();
//		
//		//driver.close(); // only parent window closes
//		//driver.quit(); // close the driver instance ,,, parent & child window is closed
//
	}

}
