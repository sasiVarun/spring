package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	
	@RequestMapping("/show")
	public String getDetails(@RequestParam String name,
			@RequestParam(name = "sid",required=false, defaultValue = "1") int id,
			Model model)
	{
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		
		return "details";
	}

}
