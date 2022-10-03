package com.test;

public class ResearchStudent {
	private String studentName;
	private String studentId;
	private Department researchDepartment;
	private University researchUniversity;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Department getResearchDepartment() {
		return researchDepartment;
	}

	public void setResearchDepartment(Department researchDepartment) {
		this.researchDepartment = researchDepartment;
	}

	public University getResearchUniversity() {
		return researchUniversity;
	}

	public void setResearchUniversity(University researchUniversity) {
		this.researchUniversity = researchUniversity;
	}

	@Override
	public String toString() {
		return "ResearchStudent [studentName=" + studentName + ", studentId=" + studentId + ", \nresearchDepartment="
				+ researchDepartment + ", \nresearchUniversity=" + researchUniversity + "]";
	}

}
