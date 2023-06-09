package com.wiley.SpringCore.refType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.SpringCore.Student;
public class MainRef {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/SpringCore/refType/configref.xml");
		WileyA aref = (WileyA) context.getBean("waref");
		System.out.println("A-b : "+aref.getObj().getCount());
		WileyB bref = (WileyB) context.getBean("wbref");
		System.out.println("B : "+bref);
	}

}
