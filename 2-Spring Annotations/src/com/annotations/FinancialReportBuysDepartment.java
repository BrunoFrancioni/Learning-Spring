package com.annotations;

public class FinancialReportBuysDepartment implements CreationFinancialReport {
	@Override
	public String getFinancialReport() {
		return "Financial report of the buys department. Year 2020.";
	}
}
