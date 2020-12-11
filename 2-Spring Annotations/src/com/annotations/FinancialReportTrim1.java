package com.annotations;

import org.springframework.stereotype.Component;

@Component("financialReportTrim1")
public class FinancialReportTrim1 implements CreationFinancialReport {

	@Override
	public String getFinancialReport() {
		return "Presentation of the financial report of the first trimester.";
	}

}
