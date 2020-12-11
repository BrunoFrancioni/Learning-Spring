package com.annotations;

import org.springframework.stereotype.Component;

@Component("financialReportTrim3")
public class FinancialReportTrim3 implements CreationFinancialReport {
	@Override
	public String getFinancialReport() {
		return "Presentation of the financial report of the third trimester.";
	}
}
