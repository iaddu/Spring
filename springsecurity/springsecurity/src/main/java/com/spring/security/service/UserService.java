package com.spring.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.dao.EmpRepo;
import com.spring.security.dao.UserRepo;
import com.spring.security.model.Employee;
import com.spring.security.model.User;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	EmpRepo empRepo;
	
	public void createUser(User user) {
		userRepo.save(user);
	}
	
	public void createEmployee(Employee employee) {
		empRepo.save(employee);
	}
}
