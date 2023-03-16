package org.pojo.classes;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{

	public AmazonPojo() {

PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="ap_email")
	private WebElement email;
	
	@FindBy(id="continue")
	private WebElement continues;
	
	@FindBy(id="ap_password")
	private WebElement passwords;
	
	@FindBy(id="signInSubmit")
	private WebElement signin;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getPasswords() {
		return passwords;
	}

	public WebElement getSignin() {
		return signin;
	}

	
}	