package qa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb16TableDemo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\bhagya-grid\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
		
		//======================
		
	List<WebElement>	allEle = driver.findElements(By.xpath("//tbody/tr/td/a"));
	System.out.println("Count : " + allEle.size());
	
//	for(WebElement e   : allEle)
//	{
//		//e.click();
//		String txt= e.getText();
//		System.out.println(txt);
//	}
		
	
//	for(WebElement e   : allEle)
//	{
//		
//		String txt= e.getText();
//		System.out.println(txt);
//		if(txt.equals("25"))
//		{
//			e.click();
//			break;
//		}
//	}
	
	Date d = new Date();
	
	DateFormat df= new SimpleDateFormat("dd");
	String day = df.format(d);
	System.out.println(day);
	
	for(WebElement e   : allEle)
	{
		
		String txt= e.getText();
		System.out.println(txt);
		if(txt.equals(day))
		{
			e.click();
			break;
		}
	}
	}

}
