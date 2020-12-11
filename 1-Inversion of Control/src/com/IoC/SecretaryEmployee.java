package com.IoC;

public class SecretaryEmployee implements Employees {
	private ReportsCreation newReport;
	
	public SecretaryEmployee(ReportsCreation newReport) {
		this.newReport = newReport;
	}
	
	@Override
	public String getTasks() {
		return "I manage the agenda of the bosses.";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report created by the Secretary: " + newReport.getReport();
	}

}
