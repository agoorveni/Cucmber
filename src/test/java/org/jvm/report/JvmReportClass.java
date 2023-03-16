package org.jvm.report;

import java.awt.List;

import java.io.File;
import java.util.LinkedList;

import org.bas.classes.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportClass {

	public static void repo(String passjsonreport) {

		File f = new File("C:\\Users\\Veni\\eclipse-workspace\\CumcumberProject\\src\\test\\resources");

		Configuration c = new Configuration(f, "Amazon");
		c.addClassifications("Browser name", "Chrome");
		c.addClassifications("Browser version", "100");
		c.addClassifications("OS name", "Windows 11");

		LinkedList<String> l = new LinkedList<String>();
		l.add(passjsonreport);

		ReportBuilder r = new ReportBuilder(l, c);

		r.generateReports();

	}

}
