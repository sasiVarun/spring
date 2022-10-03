package com.studentapp.dao;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.studentapp.entity.Student;



@Repository
public class StudentDAOImpl implements StudentDAO {

	// need to inject the session factory
	@Autowired
	private JdbcTemplate jdbcTemplate;
			
	@Override
	public List<Student> getStudents() {
		
		// create a query  ... sort by last name
		List<Student> students = 
				jdbcTemplate.query("select * from student order by last_name",
						new StudentMapper());
		// return the results		
		return students;
	}
	

	@Override
	public void saveStudent(Student student) {
		int count = jdbcTemplate.queryForObject("select count(*) from "
				+ "student where id=?",new Object[]{student.getId()}, Integer.class);
		if(count==0) {
			jdbcTemplate.update("insert into student values(?,?,?,?)",student.getId(),student.getFirstName(),
					student.getLastName(),student.getEmail());
		} else {
			jdbcTemplate.update("update student set first_name=?,last_name=?,email=? where id=?",
					student.getFirstName(),
					student.getLastName(),student.getEmail(),student.getId());
		}
	}

	@Override
	public Student getStudent(int id) {

		// now retrieve/read from database using the primary key
		Student student = jdbcTemplate.queryForObject("select * from "
				+ "student where id=?",new Object[]{id}, 
				new StudentMapper());
		
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		jdbcTemplate.update("delete from student where id=?",id);
	}

}











