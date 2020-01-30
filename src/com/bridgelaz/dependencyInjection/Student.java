package com.bridgelaz.dependencyInjection;

public class Student {
	private String name;
	private int marksInAllSubject;

	public Student() {
		System.out.println("this is Student Details ");
	}

	public Student(String name, int marksInAllSubject) {
		this.name = name;
		this.marksInAllSubject = marksInAllSubject;
	}

	public Student(String name) {

		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarksInAllSubject(int marksInAllSubject) {
		this.marksInAllSubject = marksInAllSubject;
	}

	public void show() {
		System.out.println("Name:-" + name + "  Marks:- " + marksInAllSubject);
	}
}
