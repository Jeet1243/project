package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springcoll.xml");
		
		Student student1 = (Student)context.getBean("Studentinfobean");
		System.out.println(student1);
		System.out.println(student1.getStudentName());
		System.out.println(student1.getSubjects());
		System.out.println(student1.getAddress());
		System.out.println(student1.getSubjectMarks());
		System.out.println(student1.getProps());
	}
}
