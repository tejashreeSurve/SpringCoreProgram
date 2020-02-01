package com.bridgelabz.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

// This DataBaseQuery class create the object of JdbcTemplate feature and using that execute the different query
public class DatabaseQuery {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Candidate candidate) {
		String query = "insert into candidate values ( " + candidate.getId() + ",'" + candidate.getName() + "','"
				+ candidate.getDepartment() + "','" + candidate.getCollegeName() + "' )";
		return jdbcTemplate.update(query);

	}

	public int delete(Candidate candidate) {
		String query = "delete from candidate where id='" + candidate.getId() + "'";
		return jdbcTemplate.update(query);
	}

	public int update(Candidate candidate) {
		String query = "update candidate set cname='" + candidate.getName() + "' ,department='"
				+ candidate.getDepartment() + "',collegeName='" + candidate.getCollegeName() + "' where id='"
				+ candidate.getId() + "'";
		return jdbcTemplate.update(query);
	}
}
