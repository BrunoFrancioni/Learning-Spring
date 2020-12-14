package com.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
		
		return "studentForm";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student student) {
		return "studentRegistrationConfirmation";
	}
}
