package com.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveEmployee(List<Employee> employees) {
		String sqlQuery = "insert into employee values(?,?,?)";
		
		jdbcTemplate.batchUpdate(sqlQuery, new BatchPreparedStatementSetter(){

			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				Employee employee = employees.get(index);
				ps.setInt(1, employee.getEmployeeId());
				ps.setString(2, employee.getEmployeeName());
				ps.setDouble(3, employee.getSalary());
			}

			@Override
			public int getBatchSize() {
				
				return employees.size();
			}
			
		});
		System.out.println("Batch completed");
	}
}
