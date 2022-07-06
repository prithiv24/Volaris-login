package LoginTestLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunctionLogin.CommonLogin;

public class LoginPojo extends CommonLogin {

	public LoginPojo() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//button[@class='btn btn-small mat-raised-button mat-button-base mat-terceary']")
	private WebElement userAccountLogin;

	@FindBy(id="mat-input-7")
	private WebElement email;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	private WebElement captcha;

	@FindBy(xpath="//span[text()=' Access ']")
	private WebElement access;

	public WebElement getUserAccountLogin() {
		return userAccountLogin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getAccess() {
		return access;
	}


}
