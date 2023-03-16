package org.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebElement;

public class RedBusClass extends BaseClass {

	RedBusPojo r;
	@BeforeClass
	public static void tc1() {
		browserLaunch("Chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		maxWin();
	}
	
	@Before
	public void tc2() {
		Date d = new Date();
		System.out.println(d);
			}
	
	@Test
	public void tc3() throws AWTException, InterruptedException {
		launchUrl("https://www.redbus.in/");
r = new RedBusPojo();
clickButton(r.getSelectdown());
clickButton(r.getSignin());
Thread.sleep(2000);
passVal("7708271605", r.getMobileno());
clickButton(r.getGenopts());


}
	
	
	
	
	
}
