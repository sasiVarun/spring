package com.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentapp.entity.Student;
import com.studentapp.service.StudentService;



@Controller
@RequestMapping("/student")
public class StudentController {

	// need to inject our customer service
	@Autowired
	private StudentService studentService;
	
	// @RequestMapping(value="/list",method = RequestMethod.GET)
	@GetMapping("/list")
	public String listStudents(Model model) {
		
		// get students from the service
		List<Student> students = studentService.getStudents();
				
		// add the students to the model
		model.addAttribute("students", students);
		
		return "list-students";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		// create model attribute to bind form data
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	//@RequestMapping(value="/saveStudent",method = RequestMethod.POST)
	@PostMapping("/saveStudent")
	public String saveCustomer(@ModelAttribute("student") Student student) {
		
		// save the student using our service
		studentService.saveStudent(student);	
		
		return "redirect:/student/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int id,
									Model model) {
		
		// get the student from our service
		Student student = studentService.getStudent(id);	
		
		// set student as a model attribute to pre-populate the form
		model.addAttribute("student", student);
		
		// send over to our form		
		return "student-form";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int id) {
		
		// delete the student
		studentService.deleteStudent(id);
		
		return "redirect:/student/list";
	}
}










