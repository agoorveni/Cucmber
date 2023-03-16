package org.testrunner;

import java.sql.SQLException;

import org.bas.classes.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass{

	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	dbDatas();
	

	WebDriverManager.chromedriver().setup();
	
	ChromeOptions c = new ChromeOptions();
	c.addArguments("start-maximized");
	WebDriver driver = new ChromeDriver(c);
	driver.navigate().to("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("Veni@gmail.com");
driver.findElement(By.name("pass")).sendKeys("12345");
driver.findElement(By.name("login")).click();
driver.navigate().back();
driver.navigate().forward();
	}
	
	
}
