package com.bridgelabz.springjdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcDemo {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("database.xml");
		DatabaseQuery object = context.getBean("candidatedb", DatabaseQuery.class);
		
		// This query insert record in table
		object.insert(new Candidate(5, "anna", "elect", "vjti"));
		System.out.println("Successfully added the records ");

		// This query delete record from table
		Candidate candidate = new Candidate();
		candidate.setId(6);
		object.delete(candidate);
		System.out.println("1 record is been deleted ");
		
		// This query update the record
		object.update(new Candidate(4, "reshma", "civil", "vjti"));
		System.out.println("1 record is update successfully");
		 
	}
}
