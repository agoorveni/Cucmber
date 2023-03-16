package org.sample;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	
	public static void main(String[] args) throws IOException {
	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veni\\eclipse-workspace\\Selen\\Drivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
//		ChromeOptions c = new ChromeOptions();
//		c.addArguments("--headless");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		WebElement email = driver.findElement(By.xpath("//*[@type='text' or @name='email']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:8px dashed red')", email);
		email.sendKeys("123455");
		
		
		List<WebElement> all = driver.findElements(By.tagName("a"));
		for (WebElement itr : all) {
			
			String href = itr.getAttribute("href");
			//System.out.println(href);
			if (href!=null) {
				
				URL u = new URL(href);
				
				URLConnection uc = u.openConnection();
				
				HttpsURLConnection h = (HttpsURLConnection)uc;
				
				
				int code = h.getResponseCode();
				
				if (code!=200) {
					
					System.out.println("Broken:" + href);
					
				}
				
				
			}
			
		}
		
		
		
	}
	
}
