package com.bridgelaz.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelaz.dependencyInjection.Student;

public class Dependencies {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("StudentDep.xml");
		Student objStu = context.getBean("student", Student.class);
		objStu.show();
	}
}
