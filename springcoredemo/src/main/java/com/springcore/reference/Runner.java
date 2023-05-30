package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springref.xml");
//		Address add = (Address)context.getBean("addbean");
//		System.out.println(add);
		
		Student student1 = (Student)context.getBean("studbean");
		System.out.println(student1);
	}
}
