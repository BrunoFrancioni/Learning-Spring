package com.IoC;

public class DirectorEmployee implements Employees {
	private String email;
	private String companyName;
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
}
