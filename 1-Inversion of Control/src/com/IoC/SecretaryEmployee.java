package com.IoC;

public class SecretaryEmployee implements Employees {
	@Override
	public String getTasks() {
		return "I manage the agenda of the bosses.";
	}

}
