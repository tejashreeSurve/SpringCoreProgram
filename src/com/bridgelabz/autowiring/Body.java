package com.bridgelabz.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("heartpumping.xml");
		Human obj = context.getBean("human", Human.class);
		obj.startPumping();
	}
}
