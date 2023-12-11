package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		}
	
	//Find Element
	// My Account page head
	@FindBy(xpath= "//h2[text()='My Account']")
	WebElement msgHeading;
	
	@FindBy(xpath="//a[@class='dropdown-item'][text()='Logout']")
	WebElement lnkLogout;
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkaccount;
	
	//Actions Methods
	
	public boolean isMyAccountPageExists() // My Account Page heading
	{
		try {
			return(msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
		}
	
	public void clickLogout() {
		lnkLogout.click();
	}
	public void clickaccount() {
		lnkaccount.click();
	}
	}
