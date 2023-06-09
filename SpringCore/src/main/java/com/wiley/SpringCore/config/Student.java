package com.wiley.SpringCore.config;

public class Student {
	
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
