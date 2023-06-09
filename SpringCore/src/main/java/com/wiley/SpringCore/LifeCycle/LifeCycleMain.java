package com.wiley.SpringCore.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.SpringCore.ConstInjection.Person;

public class LifeCycleMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/SpringCore/LifeCycle/lifeCycleConfig.xml");
		
		Pizza p1 = (Pizza) context.getBean("p1");
		System.out.println(p1);
		
		context.registerShutdownHook();
	}

}
