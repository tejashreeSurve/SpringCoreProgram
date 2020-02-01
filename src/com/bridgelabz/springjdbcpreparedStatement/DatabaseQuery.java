package com.bridgelabz.springjdbcpreparedStatement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;



// This DataBaseQuery class create the object of JdbcTemplate feature and using that execute the different query
public class DatabaseQuery {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Boolean insertUsingPreparedStatement(Candidate candidate) {
		String query = "insert into candidate values (?,?,?,? )";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
				preparedStatement.setInt(1, candidate.getId());
				preparedStatement.setString(2, candidate.getName());
				preparedStatement.setString(3, candidate.getDepartment());
				preparedStatement.setString(4, candidate.getCollegeName());
				return preparedStatement.execute();
			}
		});

	}

	public boolean deleteUsingPreparedStatement(Candidate candidate) {
		String query = "delete from candidate where id=?";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
				preparedStatement.setInt(1, candidate.getId());
				return preparedStatement.execute();
			}
		});
	}

	public Boolean updateUsingPreparedStatement(Candidate candidate) {
		String query = "update candidate set cname=?,department=?,collegeName=? where id=?";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
				preparedStatement.setInt(4, candidate.getId());
				preparedStatement.setString(1, candidate.getName());
				preparedStatement.setString(2, candidate.getDepartment());
				preparedStatement.setString(3, candidate.getCollegeName());
				return preparedStatement.execute();
			}
		});
	}

	public List<Candidate> getAllCandidate(){
		return jdbcTemplate.query("select * from candidate", new ResultSetExtractor<List<Candidate>>() {

			@Override
			public List<Candidate> extractData(ResultSet resultset)
					throws SQLException, DataAccessException {
				List<Candidate> list=new ArrayList<Candidate>();
				while(resultset.next()) {
					Candidate candidate= new Candidate();
					candidate.setId(resultset.getInt(1));
					candidate.setName(resultset.getString(2));
					candidate.setDepartment(resultset.getString(3));
					candidate.setCollegeName(resultset.getString(4));
					list.add(candidate);
				}
				return list;
			}
			
		});
	}
	public void  printList(List<Candidate> list) {
		for(Candidate candidate: list)
			System.out.println(candidate.getId()+"  "+candidate.getName()+"   "+candidate.getDepartment()+"  "+candidate.getCollegeName());
			System.out.println();
	}
	
}
