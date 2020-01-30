package com.bridgelabz.dependencyInjectionObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependeciesObject {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// for calling the showStatus method of Employee we have to create employee
		// object then for passing the object of salaryStatus in method we have to 
		// create object of salaryStatus class but spring can do for us 
		ApplicationContext context = new ClassPathXmlApplicationContext("objectinjection.xml");
		Employee object = context.getBean("employee", Employee.class);
		object.showStatus();
		// both employee call for same salaryStatus object without using multiple class in xml file
		OtherEmployee otherObject=context.getBean("otherEmployee", OtherEmployee.class);
		otherObject.otherempStatus();
	}
}
