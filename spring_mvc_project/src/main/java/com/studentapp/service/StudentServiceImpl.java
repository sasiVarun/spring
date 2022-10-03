package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.studentapp.dao.StudentDAO;
import com.studentapp.entity.Student;



@Service
public class StudentServiceImpl implements StudentService {

	// need to inject student dao
	@Autowired
	private StudentDAO studentDAO;
	
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);
	}

	@Override
	@Transactional
	public Student getStudent(int id) {
		
		return studentDAO.getStudent(id);
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		
		studentDAO.deleteStudent(id);
	}
}





