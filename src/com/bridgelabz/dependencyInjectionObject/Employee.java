package com.bridgelabz.dependencyInjectionObject;

public class Employee {
	String empid;
SalaryStatus status;


public void setEmpid(String empid) {
	this.empid = empid;
}
public void setStatus(SalaryStatus status) {
	this.status = status;
}
public void showStatus() {
    System.out.println("ID:- "+ empid);
    status.salaryStatus();
}
}
