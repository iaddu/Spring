package com.springcore.di_using_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/di_using_constructor/config.xml");

Student std1=(Student)context.getBean("student1");
Student std2=(Student)context.getBean("student2");
Student std3=(Student)context.getBean("student3");

System.out.println(std1);

System.out.println(std2);

System.out.println(std3);

	}

}
