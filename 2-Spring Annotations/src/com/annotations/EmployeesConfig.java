package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.annotations")
@PropertySource("classpath:companyInformation.properties")
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
