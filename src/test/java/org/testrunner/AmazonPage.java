package org.testrunner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage {
	
	static WebDriver driver;
	
	public AmazonPage() {
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) throws AWTException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		WebElement serach = driver.findElement(By.id("twotabsearchtextbox"));
		serach.sendKeys("iphone 12");
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> phones = driver.findElements(By.tagName("span"));
		for (WebElement i : phones) {
			
			System.out.println(i.getText());
			
			
		}
		
		
//		driver.get("https://www.facebook.com/");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("Veni");
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:5px solid red')", email);
//		
		
//		WebElement cre = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		cre.click();
//		
//		
//		
//		
//		WebElement mon = driver.findElement(By.id("month"));
//		
//		List<WebElement> options = mon.findElements(By.tagName("option"));
//		
//		for (WebElement itr : options) {
//			
//			
//			System.out.println(itr.getText());
//			
//			
//			List<WebElement> all = driver.findElements(By.tagName("option"));
//			for (WebElement itr1 : options) {
//				
//				System.out.println(itr1.getText());
//				
//			}
//			
//			
//			
//			
//		}
//		
//		
//		
//		
	}
	
	
}
