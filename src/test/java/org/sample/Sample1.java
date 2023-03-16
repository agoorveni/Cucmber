package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File destt = new File("C:\\Users\\Veni\\eclipse-workspace\\CumcumberProject\\Junit Report\\image.png");
		
		FileUtils.copyFile(f, destt);
		
		
		
		
//		WebElement fr = driver.findElement(By.id("fruits"));
//		
//		List<WebElement> all = fr.findElements(By.tagName("option"));
//		
//		
//		
//		for (WebElement itr : all) {
//			String text = itr.getText();
//			
//			if (text.equals("Orange")) {
//				
//				itr.click();
//			}
//			
//			
//		}
		
		
		
	}
	
	

}
