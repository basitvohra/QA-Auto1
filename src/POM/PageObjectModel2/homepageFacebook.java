package PageObjectModel2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homepageFacebook {
	
	@FindBy(id="email") WebElement Unm;
	
	@FindBy(how= How.NAME , using="pass")WebElement Pwd;

	@FindBy(how= How.XPATH , using="//button[@name='login']" )WebElement Log;
	
	@FindBy(how=How.LINK_TEXT , using="Forgotten password?")WebElement forget;
	
	
	
	
	public void doLogin(String U1,String P1)
	{
		Unm.sendKeys(U1);
		Pwd.sendKeys(P1);
		Log.click();
	}
	
	public void doRecover()
	{
		forget.click();
	}
}
