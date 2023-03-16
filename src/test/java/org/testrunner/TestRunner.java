package org.testrunner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.jvm.report.*;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Amazon1.feature", 
				glue="org.stepdefinition", monochrome=true, dryRun=false,
				plugin= {"html:target", 
						"junit:C:\\Users\\Veni\\eclipse-workspace=\\CumcumberProject\\Junit Report\\reports.xml", 
						"json:C:\\Users\\Veni\\eclipse-workspace\\CumcumberProject\\Junit Report\\jsonreport.json",
				"rerun:src\\test\\resources\\failed.txt"}
				)

public class TestRunner {

	@AfterClass
	public static void postReport() {
		
		JvmReportClass.repo("C:\\Users\\Veni\\eclipse-workspace\\CumcumberProject\\Junit Report\\jsonreport.json");
		

	}
	
	
}

