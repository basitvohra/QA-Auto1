package qa;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb16screenDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\bhagya-grid\\Drivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		
		
//   File	x	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//   File y = new File("C:\\Users\\Pandu Ranga Reddy\\eclipse-workspace\\Batch8.00AM\\src\\Pkg2\\img.png");
//   FileUtils.copyFile(x, y);
   

   Date d = new Date();
	
	DateFormat df= new SimpleDateFormat("dd-yyyy hh-mm-ss");
	String day = df.format(d);
	System.out.println(day);
	
	File	x	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File y = new File("C:\\Users\\Pandu Ranga Reddy\\eclipse-workspace\\Batch8.00AM\\src\\Pkg2\\img"+day + ".png");
	   FileUtils.copyFile(x, y);
	}

}
