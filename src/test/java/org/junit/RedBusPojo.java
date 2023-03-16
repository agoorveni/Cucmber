package org.junit;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusPojo extends BaseClass{

	public WebElement getDatepick() {
		return datepick;
	}

	

	public WebElement getSelectdown() {
		return selectdown;
	}



	public RedBusPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='onward_cal']")
	private WebElement datepick;
	
	

	@FindBy(id="select_box_sign")
	private WebElement selectdown;

	@FindBy(id="signInLink")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}
	@FindBy(id="mobileNoInp")
	private WebElement mobileno;
	
	@FindBy(id="otp-container")
	private WebElement genopts;

	public WebElement getMobileno() {
		return mobileno;
	}



	public WebElement getGenopts() {
		return genopts;
	}
	
	
	
	
}



