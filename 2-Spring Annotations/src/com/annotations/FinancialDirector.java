package com.annotations;

public class FinancialDirector implements Employees {
	private CreationFinancialReport financialReportBuysDepartment;
	
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

	@Override
	public String getTasks() {
		return "Create financial reports.";
	}

	@Override
	public String getReport() {
		return financialReportBuysDepartment.getFinancialReport();
	}
}