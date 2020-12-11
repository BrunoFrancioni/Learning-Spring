package com.IoC;

public class DirectorEmployee implements Employees {
	private ReportsCreation newReport;
	
	public DirectorEmployee(ReportsCreation newReport) {
		this.newReport = newReport;
	}
	
	@Override
	public String getTasks() {
		return "Manage the schedule and objetives of the company.";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report created by the Director: " + newReport.getReport();
	}

}
