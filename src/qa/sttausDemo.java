package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sttausDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\imp--dont delete\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement img = driver.findElement(By.id("hplogo"));
	boolean e1=	img.isDisplayed();
	System.out.println(e1);
	
	System.out.println(img.isEnabled());
	
	System.out.println(img.isSelected());
		
	}

}
