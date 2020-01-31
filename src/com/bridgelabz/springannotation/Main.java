package com.bridgelabz.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// This program is an demo of @Qualifier
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		Profile object = context.getBean("profile", Profile.class);
		object.showData();
	}
}
