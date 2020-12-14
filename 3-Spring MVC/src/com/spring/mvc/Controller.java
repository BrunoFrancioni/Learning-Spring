package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
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
	public String processForm(HttpServletRequest request, Model model) {
		model.addAttribute("name", request.getParameter("name"));
		
		return "processForm";
	}
}
