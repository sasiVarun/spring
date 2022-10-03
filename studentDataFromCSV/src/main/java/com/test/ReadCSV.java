package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ReadCSV {

	public List<Student> readStudentsFromCSV(String file) throws Exception {

		List<Student> students = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(file));

		String line = br.readLine();

		while ((line = br.readLine()) != null) {

			List<String> studentRecord = Arrays.asList(line.split(","));

			Student student = createStudent(studentRecord);
			students.add(student);
		}
		br.close();

		return students;
	}

	public Student createStudent(List<String> studentRecord) {

		return new Student(studentRecord.get(0), studentRecord.get(1), studentRecord.get(2));
	}
	
	public List<Employee> readEmployeeFromCSV(String file) throws Exception {
		List<Employee> employees = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = br.readLine();
		
		while((line=br.readLine())!=null) {			
			List<String> employeeRecord = Arrays.asList(line.split(","));			
			Employee employee = createEmployee(employeeRecord);
			employees.add(employee);			
		}
		return employees;
				
	}

	private Employee createEmployee(List<String> employeeRecord) {
		 
		return new Employee(Integer.parseInt(employeeRecord.get(0)),employeeRecord.get(1),Double.parseDouble(employeeRecord.get(2)));
	}
}
