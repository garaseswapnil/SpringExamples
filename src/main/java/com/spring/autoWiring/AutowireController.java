package com.spring.autoWiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1);
	}
}