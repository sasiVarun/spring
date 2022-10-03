package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("/students")
	public ModelAndView getStudents() {
		ModelAndView modelAndView = new ModelAndView("students");

		List<Student> students = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			Student student = new Student();
			student.setStudentName("Name" + i);
			student.setStudentId("Id" + i);
			student.setAddress("Address" + i);
			student.setPhoneNumber(i);

			students.add(student);
		}
		modelAndView.addObject("studentsAttribute", students);

		return modelAndView;
	}
}
