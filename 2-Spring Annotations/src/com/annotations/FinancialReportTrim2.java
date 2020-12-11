package com.annotations;

import org.springframework.stereotype.Component;

@Component("financialReportTrim2")
public class FinancialReportTrim2 implements CreationFinancialReport {
	@Override
	public String getFinancialReport() {
		return "Presentation of the financial report of the second trimester.";
	}
}
