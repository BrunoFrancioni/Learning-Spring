package com.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	// public String processForm(@HttpServletRequest request, Model model) {
	public String processForm(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		
		return "processForm";
	}
}
