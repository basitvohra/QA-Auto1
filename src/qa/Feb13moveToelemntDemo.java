package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Feb13moveToelemntDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions act = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		
		WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
		
		//act.moveToElement(ele1).moveToElement(ele2).contextClick().build().perform();
		
//		act.moveToElement(ele1)
//		.contextClick(ele2)
//		.build().perform();
		
		act.moveToElement(ele1)
		.click(ele2)
		.build().perform();

	}

}
