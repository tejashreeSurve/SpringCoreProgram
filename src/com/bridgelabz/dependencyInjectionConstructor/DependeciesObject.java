package com.bridgelabz.dependencyInjectionConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// injecting dependencies using constructor
public class DependeciesObject {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dependencyInjectionConstructor.xml");
		Employee object = context.getBean("employee", Employee.class);
		object.showStatus();
	
	}
}
