package org.pojo.classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.bas.classes.BaseClass;

public class Grrens extends BaseClass{

	
	public static void main(String[] args) throws AWTException {
		browserLaunch("Chrome");
		maxWin();
		launchUrl("http://www.greenstechnologys.com/");
		GreenPojo p = new GreenPojo();
		scroll(p.getNo());
		clicks(p.getCertificate());
		clicks(p.getSelenium());
		mouseover(p.getCourses());
		
		Robot r = new Robot();
		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		clicks(p.getCorejavatarining());
		scroll(p.getAnitha());
		getText("s", p.getAnitha());
		clicks(p.getCarerss());
		scroll(p.getEmaillast());
		getText("e", p.getEmaillast());
		
	}
}
