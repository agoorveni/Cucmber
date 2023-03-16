package org.pojo.classes;

import org.bas.classes.BaseClass;
import org.openqa.selenium.support.ui.Select;

public class ActaClass extends BaseClass{

	public static void main(String[] args) {
		browserLaunch("Chrome");
		maxWin();
		launchUrl("http://www.adactin.com/HotelApp/");
		ActaPojo act = new ActaPojo();
		passVal("SANDAL2098", act.getUsename());
		passVal("Sandal@123", act.getPass());
		clickButton(act.getLogbutt());
		
		Select s = new Select(act.getLocat());
		s.selectByIndex(3);

		Select h= new Select(act.getHot());
		h.selectByIndex(2);
		
		Select r= new Select(act.getRoomtype());
		r.selectByIndex(1);
		
		Select n= new Select(act.getRoomnos());
		n.selectByIndex(2);
		
passVal("08/02/2023", act.getDatein());
passVal("19/02/2023", act.getDateout());

Select ad= new Select(act.getAdultroom());
ad.selectByIndex(2);

Select ch= new Select(act.getChildroom());
ch.selectByIndex(1);

clicks(act.getSubmit());
clickButton(act.getRadio());
clicks(act.getContinues());
passVal("Veni", act.getFirstname());
passVal("AN", act.getLastname());
passVal("Chennai", act.getAddre());
passVal("1234567890123456", act.getCcnum());
Select ccc = new Select(act.getCctype());
ccc.selectByIndex(2);
Select ct = new Select(act.getCcexpmonth());
ct.selectByIndex(2);
Select cy = new Select(act.getCcexpyear());
cy.selectByValue("2022");
passVal("123", act.getCccvv());
clicks(act.getBooknow());


		
	}
	
}
