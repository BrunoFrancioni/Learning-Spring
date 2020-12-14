package com.spring.mvc;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/")
	public String examplePage() {
		return "examplePage";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "processForm";
	}
}
