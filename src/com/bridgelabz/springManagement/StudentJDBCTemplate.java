package com.bridgelabz.springManagement;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentJDBCTemplate implements StudentDAO {
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		// TODO Auto-generated method stub
		try {
	         String SQL1 = "insert into Student values (?, ?)";
	         jdbcTemplateObject.update( SQL1, name, age);

	         // Get the latest student id to be used in Marks table
	         String SQL2 = "select max(id) from Student";
	         int sid = jdbcTemplateObject.queryForInt( SQL2 );

	         String SQL3 = "insert into Marks values (?, ?, ?)";
	         jdbcTemplateObject.update( SQL3, sid, marks, year);
	         System.out.println("Created Name = " + name + ", Age = " + age);
	         
	         // to simulate the exception.
	         throw new RuntimeException("simulate Error condition") ;
	      } 
	      catch (DataAccessException e) {
	         System.out.println("Error in creating record, rolling back");
	         throw e;
	      }
	}

	@Override
	public List<StudentMarks> listStudents() {
		// TODO Auto-generated method stub
		String SQL = "select * from Student, Marks where Student.id = Marks.sid";
	      List <StudentMarks> studentMarks = (List<StudentMarks>) jdbcTemplateObject.query(SQL,  (ResultSetExtractor) new StudentMarksMapper());
	      
	      return studentMarks;
		
	}

}
