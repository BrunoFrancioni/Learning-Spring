package com.IoC;

public class BossEmployee implements Employees {
	@Override
	public String getTasks() {
		return "I manage all the stuff related to my employees";
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return null;
	}
}
