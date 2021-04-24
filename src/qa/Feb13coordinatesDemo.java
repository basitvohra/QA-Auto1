package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Feb13coordinatesDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\QA Auto\\Laxmi\\selenium-java-3.141.59\\chromedriver_win32-8\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Actions act = new Actions(driver);
		
		WebElement img = driver.findElement(By.className("lnXdpd"));
		int x = img.getLocation().getX();
		
		int y =img.getLocation().getY();
		System.out.println(x + "  " + y);
		
		//act.moveByOffset(x, y).contextClick().build().perform();
		
		act.moveToElement(img, -40, -30).contextClick().build().perform();
	}

}
