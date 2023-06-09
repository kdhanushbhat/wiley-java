package com.wiley.SpringCore.ConstInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/SpringCore/ConstInjection/pConfig.xml");
		
		Person p1 = (Person) context.getBean("p1");
		System.out.println(p1);
		
	}

}
