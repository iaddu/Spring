package com.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.model.User;
import com.spring.security.service.UserService;

@RestController

public class Register {
	@Autowired
	public PasswordEncoder passwordEncoder;
	@Autowired
	public UserService userService;
	@PostMapping("/register")
	public void createUser(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userService.createUser(user);
		System.out.println("user created successful");
	}
	
}
