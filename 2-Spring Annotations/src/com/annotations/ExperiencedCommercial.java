package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("experiencedCommercial")
public class ExperiencedCommercial implements Employees {
	private CreationFinancialReport financialReportTrim1;

	
	// Inyecting dependency using constructor 
	@Autowired
	public ExperiencedCommercial(CreationFinancialReport financialReportTrim1) {
		super();
		this.financialReportTrim1 = financialReportTrim1;
	}

	@Override
	public String getTasks() {
		return "Sell, sell and keep selling.";
	}

	@Override
	public String getReport() {
		return financialReportTrim1.getFinancialReport();
	}
}
