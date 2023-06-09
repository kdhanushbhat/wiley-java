package com.wiley.SpringCore.Autowire.Annotation;

public class Address {
	private String city;
	public Address() {
		// TODO Auto-generated constructor stub
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String city) {
		super();
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [address=" + city + "]";
	}

}
