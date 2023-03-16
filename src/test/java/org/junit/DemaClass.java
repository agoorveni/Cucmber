package org.junit;

import java.util.Date;
import java.util.Scanner;

import org.bas.classes.BaseClass;
import org.openqa.selenium.support.ui.Select;

public class DemaClass extends BaseClass{


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
		launchUrl("https://www.toolsqa.com/selenium-training/");
		DemoPoji d = new DemoPoji();
		clickButton(d.getRegister());
		passVal("Veni", d.getFirstname());
		passVal("AN", d.getLastname());
		passVal("agoorveni@gmail.com", d.getEmails());
		passVal("7708271605", d.getMobilenos());
		
		Select s = new Select(d.getContry());
		s.selectByValue("118");
		passVal("Chennai", d.getCity());
		passVal("Good morning", d.getMessage());
Scanner sca = new Scanner(System.in);
		System.out.println("Please enter the code:");
		String text = sca.next();
		passVal(text, d.getCode());
		clickButton(d.getSend());
			}
	@After
	public void tc4() {
		Date d = new Date();
		System.out.println(d);

	}
	
	
	
}
