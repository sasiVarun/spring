package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@RequestMapping("/show")
	
	@ResponseBody
	
	public String getDetails() {
		
		return "Sending data directly from return";
	}

}
