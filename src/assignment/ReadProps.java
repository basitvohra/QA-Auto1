package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadProps {
	FileInputStream fis;
	Properties p;

	public String getpropertiesDetails(String key) throws IOException
	{
		 fis = new FileInputStream("src\\assignment\\Assignment.properties");
		
		 p = new Properties();
		p.load(fis);
		String ElemnetDetails = p.getProperty(key);  //  id:email
		return ElemnetDetails;
	}
	
	
	public String getPropValue(String key1) throws IOException
	{
		ReadProps r= new ReadProps();
		String element = r.getpropertiesDetails(key1);  //  id:email
		return element;
		
	}
	
}
