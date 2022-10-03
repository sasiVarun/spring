package com.studentapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.studentapp.entity.Student;


public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int index) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setFirstName(rs.getString("first_name"));
		student.setLastName(rs.getString("last_name"));
		student.setEmail(rs.getString("email"));
		return student;
	}
	
	

}
