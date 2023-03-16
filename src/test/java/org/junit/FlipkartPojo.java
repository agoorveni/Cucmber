package org.junit;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass {

	public FlipkartPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement mobno;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement rqtotp;

	public WebElement getMobno() {
		return mobno;
	}

	public WebElement getRqtotp() {
		return rqtotp;
	}
	
}
