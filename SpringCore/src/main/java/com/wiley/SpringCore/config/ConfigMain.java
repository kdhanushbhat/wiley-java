package com.wiley.SpringCore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Student student = context.getBean("st1", Student.class);
		System.out.println(student);
				
	}

}
