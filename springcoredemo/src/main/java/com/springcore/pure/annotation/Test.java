package com.springcore.pure.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		
//		Employee emp = (Employee)context.getBean("employee");
//	    System.out.println(emp);
//////		
		Address add = (Address)context.getBean(Address.class);
		System.out.println(add);
  
	    

	}

}
