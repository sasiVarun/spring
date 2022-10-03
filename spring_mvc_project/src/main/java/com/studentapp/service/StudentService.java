package com.studentapp.service;

import java.util.List;

import com.studentapp.entity.Student;

public interface StudentService {

	public List<Student> getStudents();

	public void saveStudent(Student student);

	public Student getStudent(int id);

	public void deleteStudent(int id);
	
}
