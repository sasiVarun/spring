package com.test;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveStudent(Student student) {

		String sql = "insert into student values(?,?,?)";
		int record = jdbcTemplate.update(sql, student.getStudentId(), student.getStudentName(),
				student.getStudentAddress());
		return record;
	}

	public void saveStudentBatch(List<Student> students) {

		String sqlQuery = "insert into student values (?,?,?)";
		jdbcTemplate.batchUpdate(sqlQuery, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				Student student = students.get(index);
				ps.setString(1, student.getStudentId());
				ps.setString(2, student.getStudentName());
				ps.setString(3, student.getStudentAddress());
			}

			@Override
			public int getBatchSize() {
				return students.size();
			}

		});
		
		System.out.println("Batch insertion Done...");
	}
	
	public void saveStudentPartialBatch(List<Student> students) {
		String sqlQuery = "insert into student values(?,?,?,?)";
		
		jdbcTemplate.batchUpdate(sqlQuery,students,10,(ps,student)->{
			
			ps.setString(1, student.getStudentId());
			ps.setString(2, student.getStudentName());
			ps.setString(3, student.getStudentAddress());
			ps.setDate(4, new Date(System.currentTimeMillis()));
		});
		System.out.println("Batch insertion Done...");
	}

}
