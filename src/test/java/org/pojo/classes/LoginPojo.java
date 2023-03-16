package org.pojo.classes;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
}
