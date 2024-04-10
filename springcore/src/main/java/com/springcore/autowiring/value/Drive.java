package com.springcore.autowiring.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {
	public static void main(String ars[]) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/value/config.xml");
Student std1=(Student)context.getBean("std1");
System.out.println(std1);
}

}