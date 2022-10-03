package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping("/registrationForm")
	public String getRegistrationForm(Model model){
		Student student = new Student();
		model.addAttribute("studentAttribute", student);
		
		return "registration-form";
	}
	
	@ModelAttribute
	public void listOfCities(Model model) {
		List<String> cities = new ArrayList<>();
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Pune");
		cities.add("Mumbai");
		
		model.addAttribute("cities", cities);
	}
	
	@RequestMapping("/register")
	public String register(@Valid @ModelAttribute("studentAttribute") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "registration-form";
		}
		
		return "registered";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor st =  new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, st);
	}
}
