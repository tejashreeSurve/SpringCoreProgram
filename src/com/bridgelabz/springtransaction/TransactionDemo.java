package com.bridgelabz.springtransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TransactionDemo {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("transcation.xml");
	DatabaseQueryImp object = context.getBean("candidate", DatabaseQueryImp.class);
	
	// This query insert record in table
	object.insert(new Candidate(8, "anna", "elect", "vjti"));
	System.out.println("Successfully added the records ");

	// This query delete record from table
	/*Candidate candidate = new Candidate();
	candidate.setId(6);
	object.delete(candidate);
	System.out.println("1 record is been deleted ");
	
	// This query update the record
	object.update(new Candidate(4, "reshma", "civil", "vjti"));
	System.out.println("1 record is update successfully");*/
}
}
