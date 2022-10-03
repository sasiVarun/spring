package com.test;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Student {
	@NotEmpty(message = "First Name is required")
	private String firstName;
	private String lastName;
	@Min(value = 15,message = "Age should be minimum 15")
	private int age;
	private String course;
	private List<String> cities;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

}
