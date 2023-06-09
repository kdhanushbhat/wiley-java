package com.wiley.SpringCore.FooFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/SpringCore/FooFactory/config.xml");

		Foo st = context.getBean("foo", Foo.class);
		st.display();
		
		Foo obj = context.getBean("foo2",Foo.class);
		obj.display2();
	}

}
