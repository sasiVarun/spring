package com.test;

public class PgStudent {
	private String studentName;
	private String studentId;
	private Department pgDepartment;
	private University pgUniversity;

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

	public Department getPgDepartment() {
		return pgDepartment;
	}

	public void setPgDepartment(Department pgDepartment) {
		this.pgDepartment = pgDepartment;
	}

	public University getPgUniversity() {
		return pgUniversity;
	}

	public void setPgUniversity(University pgUniversity) {
		this.pgUniversity = pgUniversity;
	}

	@Override
	public String toString() {
		return "PgStudent [studentName=" + studentName + ", studentId=" + studentId + ", \npgDepartment=" + pgDepartment
				+ ", \npgUniversity=" + pgUniversity + "]";
	}

}
