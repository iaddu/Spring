package com.spring.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.model.Employee;

public interface EmpRepo  extends JpaRepository<Employee, Integer>{
}
