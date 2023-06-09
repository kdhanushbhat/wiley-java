package com.wiley.SpringCore.sterotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.SpringCore.sterotype.Student;

public class CompMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/SpringCore/sterotype/config.xml");
		Student obj = context.getBean("sob",Student.class);
		System.out.println(obj);
	}
	
	
}

