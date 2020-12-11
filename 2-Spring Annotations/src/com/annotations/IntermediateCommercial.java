package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("intermediateCommercial")
public class IntermediateCommercial implements Employees {
	private CreationFinancialReport financialReportTrim1;
	
	// Inyecting dependency using setter 
	@Autowired
	public void setFinancialReportTrim1(CreationFinancialReport financialReportTrim1) {
		this.financialReportTrim1 = financialReportTrim1;
	}
	
	@Override
	public String getTasks() {
		return "Keep learning how to sell.";
	}

	@Override
	public String getReport() {
		return financialReportTrim1.getFinancialReport();
	}

}
