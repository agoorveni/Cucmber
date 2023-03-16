package org.pojo.classes;

import org.bas.classes.BaseClass;

public class BrowserLaunch extends BaseClass{

	public static void main(String[] args) {
	
		browserLaunch("Chrome");
		maxWin();
		launchUrl("http://www.greenstechnologys.com/");
		LoginPojo l = new LoginPojo();
		passVal("Veni@gmail.com", l.getEmail());
		passVal("12345", l.getPassword());
		clickButton(l.getLogin());
		
	}
	
	
}
