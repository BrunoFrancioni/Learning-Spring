package com.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeUse {
	public static void main(String[] args) {
		// 1- Create a context
		// Use the xml archive
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2- Ask to the context the bean that we want
		Employees Carl = context.getBean("myEmployee", Employees.class);
		
		// 3- Use the object
		System.out.println(Carl.getTasks());
		System.out.println(Carl.getReport());
		
		// 4- Close the context and free resources
		context.close();
	}
}
