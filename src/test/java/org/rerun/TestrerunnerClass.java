package org.rerun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.JvmReportClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\failed.txt",
		monochrome=true,
		dryRun=false,
		glue="org.stepdefinition",
		plugin="json:C:\\Users\\Veni\\eclipse-workspace\\CumcumberProject\\Junit Report\\jsonreport.json")
public class TestrerunnerClass {

	@AfterClass
	public static void postReport() {
		
		JvmReportClass.repo("C:\\Users\\Veni\\eclipse-workspace\\CumcumberProject\\Junit Report\\jsonreport.json");
		

	}
	
	
}
