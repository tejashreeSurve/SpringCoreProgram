package com.bridgelabz.springtranscationexample;

import java.sql.SQLDataException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.TransactionSystemException;

public class TranscationManagerMain {
public static void main(String[] args) throws SQLDataException, RuntimeException,ClassNotFoundException {
	ApplicationContext context= new ClassPathXmlApplicationContext("transcationExample.xml");
	CustomerDAOImp customerManager=context.getBean("customerDAOImp", CustomerDAOImp.class);
	Customer cust=createDummyCustomer();
	
	customerManager.create(cust);
	
	
}

private static Customer createDummyCustomer() {
	Customer customer= new Customer();
	customer.setId(3);
	customer.setName("tejashree");
	Address address= new Address();
	address.setId(3);
	address.setAddress("mumbai");
	address.setCountry("india");
	customer.setAddress(address);
	return customer;
}
}
