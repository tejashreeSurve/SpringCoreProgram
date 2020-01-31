package com.bridgelabz.springannotationAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// This class is an demo of @Autowired annotation
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiredAnnotation.xml");
		Student object = context.getBean("student", Student.class);
		object.showData();
	}
}
