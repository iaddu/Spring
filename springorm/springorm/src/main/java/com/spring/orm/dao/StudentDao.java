package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(Student student) {
	Integer i=(Integer)this.hibernateTemplate.save(student);
	return i;
	}
	//getting single student by id
	public Student getStudent(int id) {
		return hibernateTemplate.get(Student.class,id);
	}
	
	//getting list of all student;
	 public List<Student> getAllStudents(){
		 List<Student> ls=hibernateTemplate.loadAll(Student.class);
		 return ls;
	 }
	 
	 //to delte sutdnet by id
	 @Transactional
	 public void deleteById(int id) {
		 Student std=hibernateTemplate.get(Student.class,id);
		 hibernateTemplate.delete(std);
		 System.out.println("delete successfull");
	 }
	 
	 @Transactional
	 public void updateStudent(Student student) {
		 hibernateTemplate.update(student);
		 System.out.println("update successfull");
	 }
	
}
