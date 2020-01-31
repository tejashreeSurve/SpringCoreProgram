package com.bridgelabz.springaopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// Spring AOP in xml file
public class Application {
	public static void main(String[] args) {
		// This Aop.xml container create the object of every beans class
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Aop.xml");
		// This getBean provide us Bean of class BusinessLogic
		BusinessLogic logic = context.getBean("blogic", BusinessLogic.class);
		logic.Logic1();
		logic.Logic2();
	}
}
