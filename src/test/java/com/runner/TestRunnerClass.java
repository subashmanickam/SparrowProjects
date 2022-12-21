package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=(""),monochrome=true,plugin= {"pretty","json:target\\ouput.json"},features="src\\test\\resources",glue="com.stepdefinition")


public class TestRunnerClass extends BaseClass {
	
	
	@AfterClass
	
	public static void afterClass() throws IOException {
		
		Reporting.generateJVMReport(getProjectPath()+getPropertyFilevalue("jsonpath"));

		
		
	}
	
	
	


}
