package org.bas.classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void browserLaunch(String browsername) {
		if (browsername.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		else if (browsername.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		else if (browsername.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		

	}
	public static void maxWin() {
		driver.manage().window().maximize();

	}
	public static void retrive(WebElement ret) {
		String passage = ret.getText();
System.out.println(passage);
	}
	
	public static void launchUrl(String url) {
		driver.get(url);

	}
	public static void getTitle() {
		String t = driver.getTitle();
		System.out.println(t);

	}
	
	public static void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public static void passVal(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}
	
	public static void clickButton(WebElement btn) {
		btn.click();

	}
	public static void closeBrowser() {
	
driver.close();
	}
	
	public void Dates() {
		java.util.Date d = new java.util.Date();
System.out.println(d);
	}
	
	public static void scroll(WebElement scr) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", scr);

	}
	
	public static void clicks(WebElement clic) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", clic);

	}
	
public static void mouseover(WebElement move) {
Actions Act = new Actions(driver);
Act.moveToElement(move).perform();
}	

public static void implici() {
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

}

public static void doubleclick() {
	Actions doub = new Actions(driver);
	doub.doubleClick().perform();

}

public static void getText(String s, WebElement w) {
	String txts = w.getText();
System.out.println(txts);
}

public static void downArrow(int times) throws AWTException {
	Robot r = new Robot();
	for (int i = 0; i <times ; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}

public static void dbDatas() throws ClassNotFoundException, SQLException {
	
	//load the driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
//connect the database

Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "Veni@123");
	
	//write the SQL query
	
	String q= "select * from course";
	
	//prepare statement
PreparedStatement pr = c.prepareStatement(q);
	//execute query
ResultSet ex = pr.executeQuery();

//iterate the data

if (ex.next()) {
	
	int int1 = ex.getInt("cid");
	System.out.println(int1);
	
	String string = ex.getString("cname");
	
	System.out.println(string);
	
	
}

//close db connection
c.close();

	
	
}


}
