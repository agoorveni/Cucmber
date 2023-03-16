package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.id("customers"));
		
List<WebElement> allrows = table.findElements(By.tagName("tr"));		

for (int i = 0; i < allrows.size(); i++) {
	
	WebElement rows = allrows.get(i);
	
	List<WebElement> heads = rows.findElements(By.tagName("th"));
	
	for (WebElement itr1 : heads) {
		String text1 = itr1.getText();
		System.out.println(text1);
	}
	
	List<WebElement> datas = rows.findElements(By.tagName("td"));
	for (WebElement itr : datas) {
		String text = itr.getText();
		
		System.out.println(text);
	}
		
	}
	
}


		
	}
	
	

