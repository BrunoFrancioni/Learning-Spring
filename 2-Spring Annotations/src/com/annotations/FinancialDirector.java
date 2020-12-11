package com.annotations;

import org.springframework.beans.factory.annotation.Value;

public class FinancialDirector implements Employees {
	private CreationFinancialReport financialReportBuysDepartment;
	@Value("${email_directive_team}")
	private String email;
	@Value("${company_name}")
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public FinancialDirector(CreationFinancialReport financialReportBuysDepartment) {
		super();
		this.financialReportBuysDepartment = financialReportBuysDepartment;
	}
	
	public CreationFinancialReport getFinancialReportBuysDepartment() {
		return financialReportBuysDepartment;
	}

	public void setFinancialReportBuysDepartment(CreationFinancialReport financialReportBuysDepartment) {
		this.financialReportBuysDepartment = financialReportBuysDepartment;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTasks() {
		return "Create financial reports.";
	}

	@Override
	public String getReport() {
		return financialReportBuysDepartment.getFinancialReport();
	}
}