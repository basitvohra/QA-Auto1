package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb19calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
	//	driver.findElement(By.xpath("//a[contains(text(),'23')]")).click();
		
		//====================
		
	List<WebElement> Allele =	driver.findElements(By.xpath("//table[1]/tbody[1]/tr/td/a"));
	System.out.println("count is : "+ Allele.size());
	
	for(int e=0; e<Allele.size() ; e++)
	{
		driver.findElement(By.id("txtJourneyDate")).click();
		List<WebElement> x =	driver.findElements(By.xpath("//table[1]/tbody[1]/tr/td/a"));
		Thread.sleep(1000);
		System.out.println(x.get(e).getText());
		x.get(e).click();
		Thread.sleep(300);
	}

	}

}
