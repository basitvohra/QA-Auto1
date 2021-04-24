package qa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {

     // Launch the chrome Browser
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\Downloads\\imp--dont delete\\Drivers\\chromedriver.exe");
//		
//		int i =20;
//		//demo d = new demo();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\welcome\\Downloads\\imp--dont delete\\Drivers\\geckodriver.exe");
			
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		
	}

}
