package com.wiley.SpringCore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza  {
	private double cost;
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pizza(double cost) {
		super();
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Pizza [cost=" + cost + "]";
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@PostConstruct
	public void start() {
		System.out.println("Init");
	}
	@PreDestroy
	public void end() {
		System.out.println("Destroy");
	}
	
}
