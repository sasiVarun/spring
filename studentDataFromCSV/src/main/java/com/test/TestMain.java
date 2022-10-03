package com.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) throws Exception {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReadCSV readCSV = context.getBean(ReadCSV.class);
		StudentDAO studentDAO = context.getBean(StudentDAO.class);
		EmployeeDAO empDAO = context.getBean(EmployeeDAO.class);
		
		/* File present in project folder */
//		String file = "student.csv";
		String file = "employee.csv";	
		
//		List<Student> students = readCSV.readStudentsFromCSV(file);
		List<Employee> employees = readCSV.readEmployeeFromCSV(file);
		
		/*//Inserting record by record
		 * for(Student student:students) { int result = studentDAO.saveStudent(student);
		 * 
		 * System.out.println("Record Inserted: "+result); }
		 */
		
		//Inserting Records using Batch
//		studentDAO.saveStudentBatch(students);
//		studentDAO.saveStudentPartialBatch(students);
		
		empDAO.saveEmployee(employees);
		
		context.close();
	}

}
