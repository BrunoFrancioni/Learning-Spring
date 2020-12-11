package com.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeUse {
	public static void main(String[] args) {
		// 1- Create a context
		// Use the xml archive
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2- Ask to the context the bean that we want
		DirectorEmployee Carl = context.getBean("directorEmployee", DirectorEmployee.class);
		Employees Ana = context.getBean("bossEmployee", Employees.class);
		SecretaryEmployee Blair = context.getBean("secretaryEmployee", SecretaryEmployee.class);
		
		// 3- Use the object
		System.out.println("CARL");
		System.out.println(Carl.getTasks());
		System.out.println(Carl.getReport());
		System.out.println("The email of Blair is: " + Carl.getEmail());
		System.out.println("The name of the company is: " + Carl.getCompanyName());
		System.out.println("\n");
		
		System.out.println("ANA");
		System.out.println(Ana.getTasks());
		System.out.println(Ana.getReport());
		System.out.println("\n");
		
		System.out.println("BLAIR");
		System.out.println(Blair.getTasks());
		System.out.println(Blair.getReport());
		System.out.println("The email of Blair is: " + Blair.getEmail());
		System.out.println("The name of the company is: " + Blair.getCompanyName());
		System.out.println("\n");
		
		// 4- Close the context and free resources
		context.close();
	}
}
