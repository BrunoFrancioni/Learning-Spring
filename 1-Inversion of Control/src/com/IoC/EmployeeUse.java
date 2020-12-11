package com.IoC;

public class EmployeeUse {
	public static void main(String[] args) {
		Employees employee1 = new BossEmployee();
		
		System.out.println(employee1.getTasks());
	}
}
