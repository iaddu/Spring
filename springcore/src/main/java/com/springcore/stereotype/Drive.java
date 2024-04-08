package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {
	public static void main(String ar[]) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
Student std1=(Student)context.getBean("student");
System.out.println(std1);
	}
}
