package org.stepdefinition;
import java.util.List;
import java.util.Map;

import org.bas.classes.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.classes.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class FacebooLoginp extends BaseClass{
	

	
		LoginPojo l;
		@Given("To lauch the browser and max the window")
		public void to_lauch_the_browser_and_max_the_window() {
		   browserLaunch("Chrome");
		   maxWin();
		}

		@When("Have to lauch the facebook application")
		public void have_to_lauch_the_facebook_application() {
			launchUrl("https://www.facebook.com/");
		}

		@When("To pass value in email field")
		public void to_pass_value_in_email_field() {
		    
			l=new LoginPojo();
			passVal("Veni@gmail.com", l.getEmail());
		}

		@When("To pass the value in passwors field")
		public void to_pass_the_value_in_passwors_field() {
			
			passVal("12345", l.getPassword());
		}

		@When("Have to click the login button")
		public void have_to_click_the_login_button() {
		    	
		clickButton(l.getLogin());
		
		}

		@Then("Need to close the browser")
		public void need_to_close_the_browser() {
		    closeBrowser();
		}
		
		@When("Need to lauch Facebook appln")
		public void need_to_lauch_Facebook_appln() {
		    launchUrl("https://www.facebook.com/");
		}

		@When("Pass the values in {string} email")
		public void pass_the_values_in_email(String e) {
			LoginPojo l=new LoginPojo();
				passVal(e, l.getEmail());
			
		}

		@When("Pass the values in {string} password")
		public void pass_the_values_in_password(String p) {
			LoginPojo l=new LoginPojo();
			passVal(p, l.getPassword());
		}

		@When("Click the login")
		public void click_the_login() {
			LoginPojo l=new LoginPojo();
		    clickButton(l.getLogin());
		}

		@Then("CLose the browser")
		public void close_the_browser() {
		    
		}
		
		
		//list
		
		
		@When("Pleae lauch the facebook appln")
		public void pleae_lauch_the_facebook_appln() {
		   launchUrl("https://www.facebook.com/");
		}

		@When("Passing the value in email field")
		public void passing_the_value_in_email_field(io.cucumber.datatable.DataTable d) {
			l=new LoginPojo();
		   List<String> ls = d.asList();
			passVal(ls.get(1), l.getEmail());
		}

		@When("Passing the values in password field")
		public void passing_the_values_in_password_field(io.cucumber.datatable.DataTable s) {
			l=new LoginPojo();
		   List<String> lc = s.asList();
		   passVal(lc.get(0), l.getPassword());
			
			
		}

		@When("Please click the login btn")
		public void please_click_the_login_btn() {
	clickButton(l.getLogin());
		}
		
		
		
		@When("Facbook application needs to be launched")
		public void facbook_application_needs_to_be_launched() {
		   launchUrl("https://www.facebook.com/");
		}

		@When("Email field values")
		public void email_field_values(io.cucumber.datatable.DataTable d) {
		   l = new LoginPojo();
			Map<String, String> mp = d.asMap(String.class, String.class);
			passVal(mp.get("emailone"), l.getEmail());
			
			
		}

		@When("Password filed values")
		public void password_filed_values(io.cucumber.datatable.DataTable t) {
			   l = new LoginPojo();
		List<Map<String, String>> mi = t.asMaps(String.class, String.class);
		passVal(mi.get(0).get("passone"), l.getPassword());

		
		}

		@When("Login button need to be clicked")
		public void login_button_need_to_be_clicked() {
		   clickButton(l.getLogin());
			
		}

		@Given("To lauch the required browser and maximize the window")
		public void to_lauch_the_required_browser_and_maximize_the_window() {
		   browserLaunch("Chrome");
		   maxWin();
		   
		}
		
		@When("lauch facebook application")
		public void lauch_facebook_application() {
		
			driver.get("https://www.facebook.com/");
		}

		@When("email field values")
		public void email_field_values() {
			
			
		  passVal("123", l.getEmail());
		}

		@When("passwors field values")
		public void passwors_field_values() {
		    passVal("ABC@124", l.getPassword());
		}

		@When("login button click")
		public void login_button_click() {
		    clickButton(l.getLogin());
		}

		@Then("browser close")
		public void browser_close() {

		}

		
		
		
		
	}


