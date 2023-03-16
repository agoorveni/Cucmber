package org.junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.classes.ActaPojo;

public class ActaJunitClass extends BaseClass{
	ActaPojo a;
	@BeforeClass
	public static void tc1() {
		browserLaunch("Chrome");
	}
	
	@Before
	public void tc2() {
		Date d = new Date();
		System.out.println(d);
			}
	@Test
	public void tc3() {
		launchUrl("http://www.adactin.com/HotelApp/");
		a = new ActaPojo();
		passVal("SANDAL2098", a.getUsename());
		passVal("Sandal@123", a.getPass());
		clickButton(a.getLogbutt());
		Select s = new Select(a.getLocat());
		s.selectByIndex(3);
		Select w = new Select(a.getHot());
		w.selectByIndex(3);
		
		Select r= new Select(a.getRoomtype());
		r.selectByIndex(1);
		
		Select n= new Select(a.getRoomnos());
		n.selectByIndex(2);
		
passVal("08/02/2023", a.getDatein());
passVal("19/02/2023", a.getDateout());

Select ad= new Select(a.getAdultroom());
ad.selectByIndex(2);

Select ch= new Select(a.getChildroom());
ch.selectByIndex(1);

clicks(a.getSubmit());
clickButton(a.getRadio());
clicks(a.getContinues());
passVal("Veni", a.getFirstname());
passVal("AN", a.getLastname());
passVal("Chennai", a.getAddre());
passVal("1234567890123456", a.getCcnum());
Select ccc = new Select(a.getCctype());
ccc.selectByIndex(2);
Select ct = new Select(a.getCcexpmonth());
ct.selectByIndex(2);
Select cy = new Select(a.getCcexpyear());
cy.selectByValue("2022");
passVal("123", a.getCccvv());
clicks(a.getBooknow());

		
					}
	@After
	public void tc4() {
	Dates();	
	}
	
	}

