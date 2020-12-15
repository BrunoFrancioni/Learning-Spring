package com.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	@NotNull
	@Size(min=3, message="Must have at least 3 letters.")
	private String name;
	@NotNull
	@Size(min=3, message="Must have at least 3 letters.")
	private String lastname;
	private String optative;
	@Min(value=1, message="Must have at least 1 year old.")
	@Max(value=100, message="The age can't be older than 100 years.")
	private Integer age;
	@Email(message="Insert a valid email.")
	private String email;
	@Pattern(regexp="[0-9]{5}", message="Invalid Postal Code.")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getOptative() {
		return optative;
	}
	
	public void setOptative(String optative) {
		this.optative = optative;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
