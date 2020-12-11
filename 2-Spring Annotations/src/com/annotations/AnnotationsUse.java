package com.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsUse {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeesConfig.class);
		
		Employees Ana = context.getBean("juniorCommercial", JuniorCommercial.class);
		Employees Carl = context.getBean("intermediateCommercial", IntermediateCommercial.class);
		Employees Anton = context.getBean("experiencedCommercial", ExperiencedCommercial.class);
		
		
		// @Autowired and @Qualifier
		
		System.out.println("ANA");
		System.out.println(Ana.getTasks());
		System.out.println(Ana.getReport());
		System.out.println("\n");
		
		System.out.println("CARL");
		System.out.println(Carl.getTasks());
		System.out.println(Carl.getReport());
		System.out.println("\n");
		
		System.out.println("ANTON");
		System.out.println(Anton.getTasks());
		System.out.println(Anton.getReport());
		System.out.println("\n");
		
		// @Scope for singleton and prototype
		
		Employees Lucy = context.getBean("experiencedCommercial", ExperiencedCommercial.class);
		Employees Mason = context.getBean("experiencedCommercial", ExperiencedCommercial.class);
		
		if(Lucy != Mason) System.out.println("Lucy: " + Lucy + "\nMason: " + Mason);
		
		
		context.close();
	}

}
