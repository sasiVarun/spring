package com.test;

public class Student {
	private String studentId;
	private String studentName;
	private String studentAddress;

	public Student(String studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

}
