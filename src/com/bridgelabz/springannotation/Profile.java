package com.bridgelabz.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;

public class Profile {
	@Autowired // @autowired is use to create compulsory bean
	@Qualifier("student2") // Here we can specify which id should call to avoid confusion
	private Student student;

	public void setStudent(Student student) {
		this.student = student;
	}

	public void showData() {
		System.out.println("Student Name : " + student.getName());
		System.out.println("Student Age: " + student.getAge());
	}
}
