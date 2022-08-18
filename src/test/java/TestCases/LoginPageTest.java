package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.TestBase;
import Pages.loginpage;
import Utility.FailedTestCase;

public class LoginPageTest extends TestBase{
	loginpage login;
	@BeforeMethod(groups= {"sanity"})
	public void setup() throws IOException
	{
		initilization();
		 login=new loginpage();
		
	}
	@Test
	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.LoginToApp();
	}
	
	@Test(groups = {"sanity"})
	public void VerifyKiteLogoTest()
	{
		boolean value=login.VerifyKiteLogo();
		Assert.assertEquals(value, true);
		Reporter.log("validate kite logo");
	}
	@Test(groups= {"sanity"})
	public void VerifyZerodhaLogo()
	{
		boolean value=login.VerifyZerodhaLogo();
		Assert.assertEquals(value, true);
		Reporter.log("validate zerodhalogo");
	}
	@Test(groups= {"regression"})
	public void VerifyTitle()
	{
		String value=login.GetTitle();
		Assert.assertEquals(value, "1Kite - Zerodha's fast and elegant flagship trading platform");
		Reporter.log("validate title");
	}
	@AfterMethod(groups= {"sanity"})
	public void exit(ITestResult itr) throws IOException
	{
		if(ITestResult.FAILURE==itr.getStatus());
		{
			FailedTestCase.takephoto(itr.getName());
		}
		driver.close();
		
	}
	// login test case
	

}
