package com.IoC;

public class SecretaryEmployee implements Employees {
	private ReportsCreation newReport;
	
	@Override
	public String getTasks() {
		return "I manage the agenda of the bosses.";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Report created by the Secretary: " + newReport.getReport();
	}

	public ReportsCreation getNewReport() {
		return newReport;
	}

	public void setNewReport(ReportsCreation newReport) {
		this.newReport = newReport;
	}

}
