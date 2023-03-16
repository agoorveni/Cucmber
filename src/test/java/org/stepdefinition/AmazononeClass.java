package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.bas.classes.BaseClass;
import org.junit.Assert;
import org.pojo.classes.AmazonPojo;

import cucumber.api.java.en.When;

public class AmazononeClass extends BaseClass{

	
	AmazonPojo p;
	@When("Launch the Amazon login URL")
	public void launch_the_Amazon_login_URL() {
	    p = new AmazonPojo();
	    		
	    		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damaozn%26adgrpid%3D57434613725%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiA9NGfBhBvEiwAq5vSyy0HRH3DI661Q6OWxhDKkEPJwkZiCujd-cbl6lZkFJcl4fgR4piwWxoCjgsQAvD_BwE%26hvadid%3D617724335989%26hvdev%3Dc%26hvlocphy%3D9061898%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D8775460452790382426%26hvtargid%3Dkwd-317907835099%26hydadcr%3D15413_2322997%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("Pass the dats in email field")
	public void pass_the_dats_in_email_field(io.cucumber.datatable.DataTable d) {
	    
		p = new AmazonPojo();
		Map<String, String> m = d.asMap(String.class, String.class);
		passVal(m.get("emailone"), p.getEmail());
		
	}

	@When("continue btn need to be clicked")
	public void continue_btn_need_to_be_clicked() {
	
	   clickButton(p.getContinues());
	}

	@When("Pass the code in the pass field")
	public void pass_the_code_in_the_pass_field(io.cucumber.datatable.DataTable d) {
	   
		p = new AmazonPojo();
		List<Map<String, String>> mm = d.asMaps(String.class, String.class);
		passVal(mm.get(0).get("Passwordsone"), p.getPasswords());
	}
	
	
}
