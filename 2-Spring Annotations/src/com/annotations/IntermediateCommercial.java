package com.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("intermediateCommercial")
public class IntermediateCommercial implements Employees {
	private CreationFinancialReport financialReportTrim2;
	
	// Inyecting dependency using setter 
	@Autowired
	@Qualifier("financialReportTrim2")
	public void setFinancialReportTrim1(CreationFinancialReport financialReportTrim2) {
		this.financialReportTrim2 = financialReportTrim2;
	}
	
	@Override
	public String getTasks() {
		return "Keep learning how to sell.";
	}

	@Override
	public String getReport() {
		return financialReportTrim2.getFinancialReport();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This code execute before the creation of the bean.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("This code execute after the creation of the bean.");
	}
}
