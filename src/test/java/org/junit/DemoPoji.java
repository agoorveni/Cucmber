package org.junit;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPoji extends BaseClass {

	public DemoPoji() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Go To Registration ']")
	private WebElement register;

	@FindBy(id="first-name")
	private WebElement firstname;

	@FindBy(id="last-name")
	private WebElement lastname;

	@FindBy(id="email")
	private WebElement emails;

	@FindBy(id="mobile")
	private WebElement mobilenos;

	@FindBy(xpath="//select[@Class='upcoming__registration--input']")
	private WebElement contry;

	@FindBy(id="city")
	private WebElement city;

	@FindBy(xpath="//textarea[@Class='upcoming__registration--input']")
	private WebElement message;
	
	@FindBy(id="code")
	private WebElement code;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement send;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmails() {
		return emails;
	}

	public WebElement getMobilenos() {
		return mobilenos;
	}

	public WebElement getContry() {
		return contry;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getCode() {
		return code;
	}

	public WebElement getSend() {
		return send;
	}
	
}
