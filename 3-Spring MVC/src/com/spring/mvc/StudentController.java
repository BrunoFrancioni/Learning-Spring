package com.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public String processStudentForm(@Valid @ModelAttribute("student") Student student, BindingResult validationResult) {
		if(validationResult.hasErrors()) {
			return "studentForm";
		}
		
		return "studentRegistrationConfirmation";
	}
	
	@InitBinder
	public void myBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, trimmer);
	}
}
