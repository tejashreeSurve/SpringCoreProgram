package com.bridgelabz.springannotationAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	private String age;

	@Autowired // xml file should compulsory contain or pass name property
	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public void setAge(String age) {
		this.age = age;
	}

	public void showData() {
		System.out.println("Student-Number :- " + name + "   Age:- " + age);
	}

}
