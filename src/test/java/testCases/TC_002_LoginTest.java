package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		try {
		
		logger.info("******* Starting TC_002_LoginTest********");
		
		HomePage hp= new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("******* Clicked on My Account********");
		hp.ClickLogin();
		logger.info("******* Clicked on Login link********");
		
		LoginPage lp = new LoginPage(driver); // valid email, get it from config.properties
		logger.info("*******Providing login details********");
		
		lp.setEmail(rb.getString("email"));// valid password, get it from config.properties
		lp.setPassword(rb.getString("password"));
		lp.clickLogin();
		logger.info("******* Clicked on Login button********");
				
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetpage = macc.isMyAccountPageExists();
		Assert.assertEquals(targetpage, true, "invalid login data");
	}
	catch (Exception e) {
		Assert.fail();
	}
		logger.info("******* Finished TC_002_LoginTest********");
	}
}
