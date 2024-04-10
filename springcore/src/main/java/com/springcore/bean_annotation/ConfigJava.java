package com.springcore.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.bean_annotation")
public class ConfigJava {
	@Bean
	public Samosa getSamosa() {
		Samosa s1=new Samosa();
		return s1;
	}
	
	@Bean
	public Student getStudent() {
		Student std1=new Student();
		std1.setSamosa(getSamosa());
		return std1;
	}

}
