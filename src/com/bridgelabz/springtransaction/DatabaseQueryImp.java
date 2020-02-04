package com.bridgelabz.springtransaction;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;



// This DataBaseQuery class create the object of JdbcTemplate feature and using that execute the different query
public class DatabaseQueryImp implements DataBaseQuery {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		System.out.println("im in jbdc templet");
		this.jdbcTemplate = jdbcTemplate;
	}
@Transactional
	public void insert(Candidate candidate) {
		try {
			System.out.println("this is isert");
		String query = "insert into candidate values ( " + candidate.getId() + ",'" + candidate.getName() + "','"
				+ candidate.getDepartment() + "','" + candidate.getCollegeName() + "' )";
		 jdbcTemplate.update(query);
		// throw new RuntimeException("simulate error condition");
		}catch(DataAccessException e) {
			System.out.println("Error in creating records , so rollback");
		}

	}

	public void delete(Candidate candidate) {
		String query = "delete from candidate where id='" + candidate.getId() + "'";
		 jdbcTemplate.update(query);
	}

	public void update(Candidate candidate) {
		String query = "update candidate set cname='" + candidate.getName() + "' ,department='"
				+ candidate.getDepartment() + "',collegeName='" + candidate.getCollegeName() + "' where id='"
				+ candidate.getId() + "'";
		 jdbcTemplate.update(query);
	}


}
