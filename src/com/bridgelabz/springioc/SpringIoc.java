package com.bridgelabz.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoc {
	public static void main(String[] args) {

		@SuppressWarnings("resource")

		ApplicationContext context = new ClassPathXmlApplicationContext("CarsBeans.xml");
		Cars carObj = context.getBean("car", Cars.class);
		carObj.modelName();
		carObj.modelColour();
	}
}
