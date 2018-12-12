package com.spring.SpringExamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpController {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
		
		Employee e = (Employee)context.getBean("emp");
		System.out.println(e);
	}
}