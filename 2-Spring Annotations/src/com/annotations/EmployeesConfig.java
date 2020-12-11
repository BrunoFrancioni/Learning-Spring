package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.annotations")
public class EmployeesConfig {
	@Bean
	public CreationFinancialReport financialReportBuysDepartment() {
		return new FinancialReportBuysDepartment();
	}
	
	@Bean
	public Employees financialDirector() {
		return new FinancialDirector(financialReportBuysDepartment());
	}
}
