package com.spring.jdbc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImp implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
String query="insert into Student values(?,?,?)";
int r=jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
return r;
	}
	public int change(Student student) {
String query="update student set name=?,city=? where id=?";
int r=jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
return r;
	}
	public int cancel(int id) {
String query="delete from student where id=?";
int r=jdbcTemplate.update(query,id);
return r;
	}
}
