package com.bridgelabz.dependencyInjectionConstructor;

public class Employee {
	String empid;
	int salary;

	public Employee(String empid, int salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
	public Employee(String empid) {
		this.empid = empid;
	}

	public void showStatus() {
		System.out.println("ID:- " + empid);
		System.out.println("Salary :-  " + salary);
	}
}
