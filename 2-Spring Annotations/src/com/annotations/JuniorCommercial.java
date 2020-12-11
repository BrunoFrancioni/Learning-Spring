package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("juniorCommercial")
public class JuniorCommercial implements Employees {
	// Inyecting dependency from field
	@Autowired
	private CreationFinancialReport financialReportTrim1;

	@Override
	public String getTasks() {
		return "Learning how to sell.";
	}

	@Override
	public String getReport() {
		return financialReportTrim1.getFinancialReport();
	}
}
