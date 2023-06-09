package com.wiley.SpringCore.ConstInjection;

public class Person {

	private String name;
	private String age;
	private Certificate cert;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String age,Certificate cert) {
		super();
		this.name = name;
		this.age = age;
		this.cert = cert;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cert=" + cert + "]";
	}
	
	
}
