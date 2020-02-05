package com.bridgelabz.springtranscationexample;

import java.sql.SQLDataException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

public class CustomerDAOImp  {
 private DataSource dataSource;

	public void create(Customer customer) throws RuntimeException,ClassNotFoundException,SQLDataException{
		System.out.println("hello");
		String queryCustomer="insert into customer values(?,?)";
		String queryAddress="insert into address values(?,?,?)";
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		System.out.println("hi");
		try {
			System.out.println("i m in try");
		jdbcTemplate.update(queryCustomer, new Object[] {
				customer.getId(),customer.getName()
			
				
		});
		jdbcTemplate.update(queryAddress, new Object[] {
				customer.getId(),customer.getAddress().getAddress(),
				customer.getAddress().getCountry()
		});
		System.out.println("inserted into customer table successfully");
		}catch(Exception e) {
		
			System.out.println("Error in inserting the data");
		}
		
		
	
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
