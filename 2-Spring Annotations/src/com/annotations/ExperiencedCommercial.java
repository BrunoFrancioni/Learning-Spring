package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("experiencedCommercial")
public class ExperiencedCommercial implements Employees {
	@Qualifier("financialReportTrim3")
	private CreationFinancialReport financialReportTrim3;
	
	// Inyecting dependency using constructor 
	@Autowired
	public ExperiencedCommercial(CreationFinancialReport financialReportTrim3) {
		super();
		this.financialReportTrim3 = financialReportTrim3;
	}

	@Override
	public String getTasks() {
		return "Sell, sell and keep selling.";
	}

	@Override
	public String getReport() {
		return financialReportTrim3.getFinancialReport();
	}
}
