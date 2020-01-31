package com.bridgelabz.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcDemo {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("database.xml");
	DatabaseQuery object=context.getBean("candidatedb",DatabaseQuery.class);
	int result=object.insert(new Candidate(2, "rishika", "computer", "khalsa"));
	System.out.println(result);
}
}
