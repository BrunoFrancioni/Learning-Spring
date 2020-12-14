package com.IoC;

public class BossEmployee implements Employees {
	private ReportsCreation newReport;
	
	public BossEmployee(ReportsCreation newReport) {
		this.newReport = newReport;
	}
	
	@Override
	public String getTasks() {
		return "I manage all the stuff related to my employees";
	}

	@Override
	public String getReport() {
		return "Report created by the Boss: " + newReport.getReport();
	}
}
