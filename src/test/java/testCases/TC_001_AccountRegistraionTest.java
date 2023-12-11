package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistraionTest extends BaseClass {

	
	@Test(groups = {"Regression","Master"})
	void test_account_Registraion() throws InterruptedException
	{
		logger.debug("application logs........");
		logger.info("*****Starting  TC_001_AccountRegistraionTest*****");
		try
		{
			HomePage hp=new HomePage(driver);
			hp.ClickMyAccount();
			logger.info("*****Click on My Account link*****");
			
			hp.ClickRegister();
			logger.info("*****Click on Register link*****");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		logger.info("*****Providing Customer Data*****");
		
		regpage.SetFirstName(randomeString().toUpperCase());
		
		regpage.SetLastName(randomeString().toUpperCase());
		
		regpage.SetEmail(randomeString()+"@gmail.com");// randomly generated the email
		
		String Password=randomAlphaNumeric();
		regpage.SetPassword(Password);
		
		regpage.setPrivacyPolicy();
		
		regpage.clickContinue();
		logger.info("*****Click on Continue*****");
	
		String confmsg= regpage.getConfirmationMsg();
		
		logger.info("*****Validating Expected message*****");
		Assert.assertEquals(confmsg, "Your Account Has Been Created!", "not getting expected message");
		}
		
		catch(Exception e)
		{
			logger.error("*****Test Failed*****");
			Assert.fail();
		}
		logger.info("*****Finished  TC_001_AccountRegistraionTest*****");
	}
	
}
