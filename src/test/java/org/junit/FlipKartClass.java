package org.junit;

import java.util.Date;

import org.bas.classes.BaseClass;
import org.pojo.classes.BrowserLaunch;

public class FlipKartClass extends BaseClass {

	@BeforeClass
	public static void tc1() {
		browserLaunch("Chrome");
			}
	
	@Before
	public void tc2() {

	Dates();
	}
	@Test
	public void tc3() {
		launchUrl("https://www.flipkart.com/account/login");
		FlipkartPojo f = new FlipkartPojo();
		passVal("7708271605", f.getMobno());
		clickButton(f.getRqtotp());
	}
	@After
	public void tc4() {
		Date d = new Date();
		System.out.println(d);

	}
	
	}
	

