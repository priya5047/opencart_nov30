package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	// Find Elements
	
	//***** 1 ******
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	//***** 2 *****
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	//***** 3 *****
		@FindBy(xpath=" //button[text()='Login']")
		WebElement btnLogin;
	
	// Actions
		
		//***** 1 ******
		public void setEmail(String email) {
			txtEmailAddress.sendKeys(email);
		}
		
		//***** 2 *****
		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);
		}
		
		//***** 3 *****
		public void clickLogin(){
			btnLogin.click();
		}
}
