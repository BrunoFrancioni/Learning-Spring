package com.IoC;

public class Report implements ReportsCreation {
	@Override
	public String getReport() {
		return "This is the presentation of the report.";
	}

}
