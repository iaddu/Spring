package com.springcore.configjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {
	public static void main(String ar[]) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigJava.class);
	Employee emp1=(Employee)context.getBean("emp1");
	System.out.println(emp1);
	}
}
