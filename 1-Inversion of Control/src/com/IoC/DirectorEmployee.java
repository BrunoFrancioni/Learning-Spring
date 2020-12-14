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
		return "Report created by the Director: " + newReport.getReport();
	}
	
	// Init method
	
	public void init() {
		System.out.println("Init method. Here we can define all the methods to execute before the bean is ready.");
	}
	
	// Destroy method
	
	public void destroy() {
		System.out.println("Destoy method. Here we can define all the method to execute after the bean is not longer used.");
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
