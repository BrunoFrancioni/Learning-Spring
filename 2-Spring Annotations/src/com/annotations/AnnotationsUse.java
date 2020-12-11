package com.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsUse {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employees Anton = context.getBean("experiencedCommercial", ExperiencedCommercial.class);
		Employees Carl = context.getBean("intermediateCommercial", IntermediateCommercial.class);
		Employees Ana = context.getBean("juniorCommercial", JuniorCommercial.class);
		
		System.out.println("ANTON");
		System.out.println(Anton.getTasks());
		System.out.println(Anton.getReport());
		System.out.println("\n");
		
		System.out.println("CARL");
		System.out.println(Carl.getTasks());
		System.out.println(Carl.getReport());
		System.out.println("\n");
		
		System.out.println("ANA");
		System.out.println(Ana.getTasks());
		System.out.println(Ana.getReport());
		System.out.println("\n");
		
		context.close();
	}

}
