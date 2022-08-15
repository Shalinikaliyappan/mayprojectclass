
package com.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(snippets= SnippetType.CAMELCASE,dryRun=false,plugin= {"pretty","json:target/Hello.json"},
                 monochrome=true,features="src\\test\\resources",glue="com.stepDefinition")
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
	Reporting.generateJVMReport(System.getProperty("user.dir")+"\\target\\Hello.json");
		
		
	}
 
}