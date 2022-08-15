
package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJVMReport(String jsonFile) {
		File file = new File("C:\\Users\\shali\\eclipse-workspace\\OMRBranchAdactinHotelAutomations");
	  Configuration configuraion = new Configuration(file,"AdactinHotel");
	 configuraion.addClassifications("Browsername","Chrome");
	 configuraion.addClassifications("Browserversion","103");
	 configuraion.addClassifications("OS","Windows 11");
	 List<String>jsonFiles= new ArrayList<String>();
	 jsonFiles.add(jsonFile);
	 ReportBuilder builder = new ReportBuilder(jsonFiles,configuraion);
	 builder.generateReports();
	}
}