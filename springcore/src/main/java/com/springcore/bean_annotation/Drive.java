package com.springcore.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context =new AnnotationConfigApplicationContext(ConfigJava.class);
Student std1=(Student)context.getBean("getStudent");

System.out.println(std1);
	}

}
