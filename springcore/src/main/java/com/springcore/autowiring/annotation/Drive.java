package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {
	public static void main(String ar[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/config.xml");
	Employee emp1=(Employee)context.getBean("emp1");
	System.out.println(emp1);
	}
}
