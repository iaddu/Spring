package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsecurityApplication {
	public static void main(String[] args) {
	System.out.println("hiie");
    System.setProperty("org.springframework.security.logging.debug", "true"); // Enable Spring Security logging

		SpringApplication.run(SpringsecurityApplication.class, args);
	}
}
