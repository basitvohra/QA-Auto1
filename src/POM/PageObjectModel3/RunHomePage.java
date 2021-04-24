package PageObjectModel3;

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
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.Brwserselection;
import Utility.ExcelReadDemo;

public class RunHomePage {
	
	 WebDriver driver=null;
		
		@BeforeMethod
		public void Launch()
		{
			driver=  Brwserselection.Launch("chrome", "https://www.facebook.com/");
		}
		
  @Test(dataProvider="credencials")
  public void LoginTC(String u ,String p) {
	  
	  homepageFacebook h1 = PageFactory.initElements(driver, homepageFacebook.class);
	  h1.doLogin(u,p);
  }
  
  @DataProvider
  public Object[][] credencials() throws IOException 
  {
	ExcelReadDemo e= new ExcelReadDemo();
	
	int r =e.getLastRowDetails(0);
	int c= e.getLastColDetails(0);
	
	Object[][] obj = new Object[r+1][c];
	for(int row =1 ; row <= r; row++)
	{
		for(int col =0; col < c; col++)
		{
			obj[row][col]= e.getExcelData(0, row, col);
		}
	}
	return obj;
	
  }
  
    
  
  @Test
  public void ForgetTC() {
	  
	  homepageFacebook h1 = PageFactory.initElements(driver, homepageFacebook.class);
	  h1.doRecover();
  }
  
  @AfterMethod
	//public void TearDown()
	public void TearDown(ITestResult r) throws IOException
	{
		int statusTC =r.getStatus();
		int expedtedStatus =ITestResult.FAILURE;
		
		//if(r.getStatus() == ITestResult.FAILURE)
		if(statusTC == expedtedStatus)
		
		{
			Date d = new Date();
			
			DateFormat df= new SimpleDateFormat("dd-yyyy hh-mm-ss");
			String day = df.format(d);
			System.out.println(day);
			
			File	x	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   File y = new File("src\\scrren\\img"+day + ".png");
			   FileUtils.copyFile(x, y);
		}
		else
		{
			driver.close();
		}
		
	}
}
