package org.stepdefinition;

import org.bas.classes.BaseClass;
import org.junit.DemoPoji;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoClass extends BaseClass{

	DemoPoji d;
	@Given("Lauch the required browser")
	public void lauch_the_required_browser() {
	   browserLaunch("Chrome");
	   maxWin();
	}

	@When("Need to lauch the demo application")
	public void need_to_lauch_the_demo_application() {
	   launchUrl("https://www.toolsqa.com/selenium-training/");
	}

	@When("Need to click go to registration")
	public void need_to_click_go_to_registration() {
		
		d= new DemoPoji();
	   clickButton(d.getRegister());
	}

	@When("Need to pass value in firstname")
	public void need_to_pass_value_in_firstname() {
		d= new DemoPoji();
	   passVal("Veni", d.getFirstname());
	}

	@When("Need the pass the value in lastname")
	public void need_the_pass_the_value_in_lastname() {
		d= new DemoPoji();
		passVal("AN", d.getLastname());
	}

	@Then("Need to close the Demo browser")
	public void need_to_close_the_Demo_browser() {
	   
	}

	@When("Have to lauch the demosite application")
	public void have_to_lauch_the_demosite_application() {
	   launchUrl("https://www.toolsqa.com/selenium-training/");
	}

	@When("Have to clicj the registration button")
	public void have_to_clicj_the_registration_button() {
		d= new DemoPoji();
		clickButton(d.getRegister());
	}

	@When("Has to pass the value in {string} first name")
	public void has_to_pass_the_value_in_first_name(String fs) {
		d= new DemoPoji();
		passVal(fs, d.getFirstname());
	
	}

	@When("Has to pass the value in {string} last name")
	public void has_to_pass_the_value_in_last_name(String ln) {
	   passVal(ln, d.getLastname());
	}

	@When("Need to pass the value in {string} email field")
	public void need_to_pass_the_value_in_email_field(String email) {
	   passVal(email, d.getEmails());
	}

	@When("Need to add mobile {string} number")
	public void need_to_add_mobile_number(String mobno) {
	   passVal(mobno, d.getMobilenos());
	}

	@When("Need to selct the country")
	public void need_to_selct_the_country() {
	   
		Select s = new Select(d.getContry());
		s.selectByIndex(4);
		
	}

	@When("Pass the city {string} value")
	public void pass_the_city_value(String city) {
	   passVal(city, d.getCity());
	}

	@When("Pass the {string} message")
	public void pass_the_message(String mess) {
	   passVal(mess, d.getMessage());
	}

	@When("Need to click the send button")
	public void need_to_click_the_send_button() {
	   clicks(d.getSend());
	}

	@Then("Need to close the browser application")
	public void need_to_close_the_browser_application() {
	   
	}

	
	
	
}
