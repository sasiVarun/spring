package com.test;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/page1")
	public String getPage1(HttpServletRequest request, HttpSession session) {

		if (session.getAttribute("date") == null)
			session.setAttribute("date", new Date());
		if (request.getAttribute("date") == null)
			request.setAttribute("date", new Date());
		return "redirect:page2";
	}
	
	@RequestMapping("/page2")
	public String getPage2() {
			
		return "date";
	}
}
