package qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb11calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		
		WebElement dt =driver.findElement(By.id("txtJourneyDate"));
				dt.click();
		
				//==========================
//		driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
//		System.out.println("date is : " + dt.getText());
		
		//========================================
				
		List<WebElement> allEle = driver.findElements(By.xpath("//table[1]/tbody[1]/tr/td/a"));
		System.out.println("count : " + allEle.size());
		
		for(int i =0; i< allEle.size() ;i++)
		{
			String txt= allEle.get(i).getText();
			System.out.println(txt);
			Thread.sleep(200);
			
			if(txt.matches("15"))
			{
				allEle.get(i).click();
				break;
			}
			
			
		}
		
	}

}
