package com.bridgelabz.springjdbcpreparedStatement;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcDemo {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("preparedStatement.xml");
		DatabaseQuery object = context.getBean("candidatedb", DatabaseQuery.class);
		
		object.insertUsingPreparedStatement(new Candidate(5, "ashu", "elect", "vjti"));
		System.out.println("Successfully added the records ");
		List<Candidate> list=object.getAllCandidate();
		object.printList(list);
		
		
		 /*Candidate candidate = new Candidate(); 
		 candidate.setId(6);
		 object.deleteUsingPreparedStatement(candidate);
		 System.out.println("1 record is been deleted ");
		 List<Candidate> list=object.getAllCandidate();
		 object.printList(list);
		 */
		 
		
		/*object.updateUsingPreparedStatement(new Candidate(4, "reshma", "computer", "vjti"));
		System.out.println("1 record is update successfully");
		List<Candidate> list=object.getAllCandidate();
		object.printList(list);
		*/
		
		/*System.out.println("This is list ");
		List<Candidate> list=object.getAllCandidate();
		object.printList(list);
		*/
	}
}
