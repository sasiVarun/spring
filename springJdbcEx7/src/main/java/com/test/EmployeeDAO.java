package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	public List<Employee> getSalaryGreaterThanAvgSalary(){	
		String sqlQuery = "select * from employee where employeesalary>(select avg(employeesalary) from employee)";
		List<Employee> employees = namedParameterJdbcTemplate.query(sqlQuery, new EmployeeMapper());		
		return employees;
	}
}
