package com.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {		
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt("employeeId"));
		employee.setEmployeeName(rs.getString("employeename"));
		employee.setEmployeeSalary(rs.getDouble("employeesalary"));
		return employee;
	}

}
