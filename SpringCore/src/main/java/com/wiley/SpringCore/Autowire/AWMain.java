package com.wiley.SpringCore.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/SpringCore/Autowire/AWconfig.xml");
		
		Employee p1 = (Employee) context.getBean("emp1");
		System.out.println(p1);
		
	
	}

}
