package com.report;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reporting extends BaseClass {
	
	public static void generateJVMReport(String jsonfile) throws IOException {

		
File file = new File(getProjectPath()+getPropertyFilevalue("jvmpath"));

		
		Configuration configure = new Configuration(file, "Adaction Hotel App Automation");
		
		
		configure.addClassifications("Browser", "Chrome");
		configure.addClassifications("Verison", "108");
		configure.addClassifications("OS", "WINDOWS - 11");
		configure.addClassifications("Sprint", "32");
		
		
		List<String> jsonfiles = new ArrayList<String>();
		
		
jsonfiles.add(jsonfile);


ReportBuilder builder = new ReportBuilder(jsonfiles, configure);

builder.generateReports();


	}

		
	
		
		
		
		
		
}
