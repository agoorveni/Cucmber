package org.stepdefinition;

import org.bas.classes.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{

	@Before
	public void tc1() {
		browserLaunch("Chrome");
		System.out.println("Browserlaunched");

	}
	@After(order=2)
	public void tc2() {
		System.out.println("Browser closed");

	}
	
	@After(order=3)
	public void tc3(Scenario s) {
		if (s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(scr, "image/png");
			
			
		}

	}
	
	
}
