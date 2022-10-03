package com.test;

public class University {
	private String universityName;
	private String universityAddress;

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityAddress() {
		return universityAddress;
	}

	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}

	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", universityAddress=" + universityAddress + "]";
	}

}
