package com.IoC;

public class SecretaryEmployee implements Employees {
	private String email;
	private String companyName;
	private ReportsCreation newReport;
	
	@Override
	public String getTasks() {
		return "I manage the agenda of the bosses.";
	}

	@Override
	public String getReport() {
		return "Report created by the Secretary: " + newReport.getReport();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ReportsCreation getNewReport() {
		return newReport;
	}

	public void setNewReport(ReportsCreation newReport) {
		this.newReport = newReport;
	}

}
