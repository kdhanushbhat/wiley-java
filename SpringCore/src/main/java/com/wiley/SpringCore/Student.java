package com.wiley.SpringCore;

import java.util.*;

public class Student {
	private String studentId;
	private String studentName;
	private Address studentAddress;
	private List<String> subjects;
	private Set<String> hobbies;
	private Map<String, String> grades;
	

	public Student(String studentId, String studentName,Address studentAddress, List<String> subjects,
			Set<String> hobbies, Map<String, String> grades) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.subjects = subjects;
		this.hobbies = hobbies;
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", subjects=" + subjects + ", hobbies=" + hobbies + ", grades=" + grades + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Map<String, String> getGrades() {
		return grades;
	}

	public void setGrades(Map<String, String> grades) {
		this.grades = grades;
	}

}
