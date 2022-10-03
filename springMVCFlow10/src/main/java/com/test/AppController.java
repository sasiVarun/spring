package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/show/{sid}/{name}")
	
	public String getDetails(@PathVariable(name = "sid") int id,
			@PathVariable String name, Model model) 
	{
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		return "details";
	}
}
