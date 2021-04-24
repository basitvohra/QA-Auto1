package qa;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dayDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		WebElement fn= driver.findElement(By.name("firstname"));
		fn.sendKeys("FNTest");
		WebElement ln= driver.findElement(By.name("lastname"));
		ln.sendKeys("LNTest");
		
		
		WebElement em= driver.findElement(By.name("reg_email__"));
		em.sendKeys("LNTest.FNTest@gmail.com");
		
		WebElement pass= driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("pass1");
		
		WebElement em2= driver.findElement(By.name("reg_email_confirmation__"));
		em2.sendKeys("LNTest.FNTest@gmail.com");
		
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select s= new Select(day);
		Select m= new Select(month);
		Select y= new Select(year);
//		s.selectByIndex(3);
//		Thread.sleep(2000);
//		s.selectByValue("1");
//		Thread.sleep(2000);
//		s.selectByVisibleText("10");
		
		
		List<WebElement> alldays = s.getOptions();
		
		System.out.println("count : " + alldays.size());
		
		for(int i=0 ; i< alldays.size() ; i++)
		{
			System.out.println(alldays.get(i).getText());
			alldays.get(i).click();
			if(alldays.get(i).getText().equalsIgnoreCase("10"))
			{
				alldays.get(i).click();
				break;
			}
			Thread.sleep(500);
		}

		Thread.sleep(2000);

		List<WebElement> allmonths = m.getOptions();
		
		System.out.println("count : " + allmonths.size());
		
		for(int i=0 ; i< allmonths.size() ; i++)
		{
			System.out.println(allmonths.get(i).getText());
			allmonths.get(i).click();
			if(allmonths.get(i).getText().equalsIgnoreCase("Nov"))
			{
				allmonths.get(i).click();
				break;
			}
			Thread.sleep(500);
		}

		

		Thread.sleep(2000);

		List<WebElement> allyears = y.getOptions();
		
		System.out.println("count : " + allyears.size());
		
		for(int i=0 ; i< allyears.size() ; i++)
		{
			System.out.println(allyears.get(i).getText());
			allyears.get(i).click();
			if(allyears.get(i).getText().equalsIgnoreCase("2015"))
			{
				allyears.get(i).click();
				break;
			}
			Thread.sleep(500);
		}

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

}

