package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		}
	//Elements
	
	@FindBy(name  ="firstname")//1
	WebElement txtFirstname;
	
	@FindBy(name  ="lastname")//2
	WebElement txtLastname;
	
	@FindBy(name  ="email")//3
	WebElement txtEmail;
	
	@FindBy(name  ="password")//4
	WebElement txtPassword;
	
	@FindBy(name = "agree")
	WebElement chkdPolicy;//5
	
	@FindBy(xpath = "//button[text()='Continue']")//6
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")//7
	WebElement msgConfirmation;
	
	// Actions
		
	public void SetFirstName(String fname) {  //1
		txtFirstname.sendKeys(fname);		
	}
	
	public void SetLastName(String lname) {   //2
		txtLastname.sendKeys(lname);
	}
	
	public void SetEmail(String email) {  //3
		txtEmail.sendKeys(email);
	}
	
	public void SetPassword(String pwd)  { //4
		txtPassword.sendKeys(pwd);
		}
	
	public void setPrivacyPolicy() {   //5
		chkdPolicy.click();
	}
	
	public void clickContinue() {   //6
		//solution 1 
		btnContinue.click();
		
		//solution 2 
		//btnContinue.submit();
		
		//solution 3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//solution 4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		//Solution 5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Solution 6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
	}
	
	public String getConfirmationMsg() {        //7
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
}

