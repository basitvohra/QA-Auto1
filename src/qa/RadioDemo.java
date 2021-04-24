package qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	static WebDriver driver;
	
	public void maleclick()
	{
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

	public void allRadio() throws InterruptedException
	{
		//int x= 10;
		List<WebElement> allEle = driver.findElements(By.name("sex"));
		int cnt = allEle.size();
		System.out.println("count od elemnts: " + cnt);
		
//		for(int e=0 ;e< cnt ;e++)
//		{
//			allEle.get(e).click();
//			Thread.sleep(1000);
//		}
		
		for(WebElement x : allEle)  // F , M, C
		{
			x.click();
			Thread.sleep(1000);
		}
	}
	
	public void allLabel() throws InterruptedException
	{
		//int x= 10;
		List<WebElement> allEle = driver.findElements(By.xpath("//label[@class='_58mt']"));
		int cnt = allEle.size();
		System.out.println("count od elemnts: " + cnt);
		

		
		for(WebElement x : allEle)  // F , M, C
		{
			String txt= x.getText();
			System.out.println(txt);
			
			if(txt.equals("Male"))
			{
				if(!x.isSelected())
				{
					x.click();
					break;
				}
			}
						
			Thread.sleep(1000);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\imp--dont delete\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		RadioDemo r= new RadioDemo();
		//r.maleclick();
		
		//r.allRadio();
		
		r.allLabel();

	}

}
