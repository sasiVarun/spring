package com.test;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/session")
	public String getMySession(HttpServletRequest request, HttpSession session) {

		if (session.getAttribute("date") == null)
			session.setAttribute("date", new Date());
//		session.setMaxInactiveInterval(3);
		if (request.getAttribute("date") == null)
			request.setAttribute("date", new Date());
		return "session";
	}
}
