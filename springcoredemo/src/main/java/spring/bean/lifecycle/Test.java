package spring.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/bean/lifecycle/spring.xml");
		Employee emp = (Employee) context.getBean("E1");
		System.out.println(emp);
		context.registerShutdownHook();
	}

}
