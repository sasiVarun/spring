package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
public class AppController {

	@RequestMapping("/registerForm")
	public String registerFormPage(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "registration-form";
	}

	@ModelAttribute("jobType")
	public List<String> jobType() {
		List<String> jobType = Arrays.asList("Permanent", "Contract");
		return jobType;
	}

	@ModelAttribute("skills")
	public List<String> programmingSkills() {
		List<String> skills = Arrays.asList("Java", "Python", "JavaScript", "HTML", "PHP", "C#");

		return skills;
	}

	@ModelAttribute("experienceYears")
	public List<String> experienceYears() {
		List<String> experienceYears = Arrays.asList("1-3 years", "3-5 years", "Above 5 years");
		return experienceYears;
	}

	@RequestMapping("/register")
	public String register(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
		System.out.println(employee.getDob().toLocaleString());
		if (result.hasErrors()) {
			return "registration-form";
		}
		return "success";
	}

}
