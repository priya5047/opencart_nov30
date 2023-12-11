package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText = "Register")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement linkLogin;
	
	// Action Methods
	
	public void ClickMyAccount()
		{
		lnkMyaccount.click();
		}
	public void ClickRegister() 
	{
		lnkRegister.click();
		
	}
	
	public void ClickLogin()
	{
		linkLogin.click();
		}

}
