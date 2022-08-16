package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class loginpage extends TestBase{
	
	@FindBy(css="*[alt=\"Kite\"")private WebElement ZerodhaLogo;
	@FindBy(css="*[alt=\"Zerodha\"")private WebElement KiteLogo;
	
	@FindBy(css="*#userid")private WebElement userid;
	@FindBy(css="*#password")private WebElement pass;
	@FindBy(css="*[type=\"submit\"")private WebElement login;
	@FindBy(css="*[label=\"PIN\"")private WebElement pin;
	@FindBy(css="*[type=\"submit\"")private WebElement contine;
	
	
	public loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		userid.sendKeys(ReadExcelFile(0, 0));
		Thread.sleep(1000);
		pass.sendKeys(ReadExcelFile(0, 1));
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		pin.sendKeys(ReadExcelFile(0, 2));
		Thread.sleep(1000);
		contine.click();
		
		
		
		
		
		
	}
	public String GetTitle()
	{
		return driver.getTitle();
		
	}
	public boolean VerifyKiteLogo()
	{
		return KiteLogo.isDisplayed();
	}
	public boolean VerifyZerodhaLogo()
	{
		return ZerodhaLogo.isDisplayed();
	}
	
	

}
