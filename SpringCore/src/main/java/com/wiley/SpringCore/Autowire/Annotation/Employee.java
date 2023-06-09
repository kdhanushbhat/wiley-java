package com.wiley.SpringCore.Autowire.Annotation;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Address address;
	private List<String> subjects;
	private Set<String> hobbies;
	private Map<String, String> grades;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", subjects=" + subjects + ", hobbies=" + hobbies + ", grades=" + grades
				+ "]";
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
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Autowired
	public Employee(Address address, List<String> subjects, Set<String> hobbies, Map<String, String> grades) {
		super();
		this.address = address;
		this.subjects = subjects;
		this.hobbies = hobbies;
		this.grades = grades;
	}

}
