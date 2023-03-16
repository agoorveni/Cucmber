package org.pojo.classes;

import java.util.Scanner;

import org.bas.classes.BaseClass;
import org.junit.DemoPoji;
import org.openqa.selenium.support.ui.Select;

public class DemoPojoClass extends BaseClass{

	
	public static void main(String[] args) {
		browserLaunch("Chrome");
		maxWin();
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
		Scanner scann = new Scanner(System.in);
		System.out.println("Please enter the code:");
		String text = scann.next();
		passVal(text, d.getCode());
		clickButton(d.getSend());
	}
}
