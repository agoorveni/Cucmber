package org.junit;

import java.util.Date;

import org.bas.classes.BaseClass;
import org.pojo.classes.LoginPojo;

public class Facebookpage extends BaseClass{
	@BeforeClass
	public static void tc2() {
		browserLaunch("Chrome");
	}
	@Test	
public void tc3() {
	launchUrl("https://www.facebook.com/");
	LoginPojo l = new LoginPojo();
		passVal("Veni@gmail.com", l.getEmail());
passVal("12345", l.getPassword());
clickButton(l.getLogin());
}	
	
@Before
public void tc1() {
	Date d = new Date();
	System.out.println(d);
}
@After	
public void tc4() {
	Date d = new Date();
	System.out.println(d);


}	
}
