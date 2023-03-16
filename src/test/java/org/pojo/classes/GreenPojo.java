package org.pojo.classes;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreenPojo extends BaseClass{

	public GreenPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()= 'No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement no;
	
	public WebElement getNo() {
		return no;
	}

	public WebElement getCertificate() {
		return certificate;
	}

	public WebElement getSelenium() {
		return selenium;
	}

	public WebElement getCourses() {
		return courses;
	}

	public WebElement getJavatarining() {
		return javatarining;
	}

	public WebElement getCorejavatarining() {
		return corejavatarining;
	}

	public WebElement getAnitha() {
		return Anitha;
	}

	public WebElement getCarerss() {
		return carerss;
	}

	public WebElement getEmaillast() {
		return emaillast;
	}

	@FindBy(xpath="//a[text()= 'Certifications']")
	private WebElement certificate;
	
	@FindBy(xpath="(//a[text()= 'Course Content'])[29]")
	private WebElement selenium;
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement courses;
	
	
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement javatarining;
	
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement corejavatarining;
	
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement Anitha;
	
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement carerss;
	
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[12]")
	private WebElement emaillast;

	
	
	
	
	
}


