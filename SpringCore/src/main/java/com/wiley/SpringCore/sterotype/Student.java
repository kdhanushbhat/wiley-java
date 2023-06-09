package com.wiley.SpringCore.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sob")
public class Student {
	@Value("kdb")
	private String name;
	@Value("benglur")
	private String city;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}

}
