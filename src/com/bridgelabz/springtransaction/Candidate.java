package com.bridgelabz.springtransaction;

// This class is simple pojo class
public class Candidate {
	int id;
	String name;
	String department;
	String collegeName;

	public Candidate(int id, String name, String department, String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.collegeName = collegeName;
	}

	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
