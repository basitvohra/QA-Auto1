package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Feb13DragDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		JavascriptExecutor js =((JavascriptExecutor) driver);
		
		js.executeScript("scroll(0 , +200)");
		
		
		
		
		
	WebElement frameEle	= driver.findElement(By.className("demo-frame"));
	
	//WebElement frameEle	= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	driver.switchTo().frame(frameEle);
	
	WebElement scr = driver.findElement(By.id("draggable"));
	
	WebElement tgt = driver.findElement(By.id("droppable"));
	
//	act.dragAndDrop(scr, tgt).perform();
	
	act.dragAndDropBy(scr, 90, 100).perform();
	
	if(tgt.getText().matches("Dropped!"))
	{
		System.out.println("successfull Drop...");
	}
	else
	{
		System.out.println("Failed...");
	}
	

	}

}
