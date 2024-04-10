package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {
	public static void main(String ar[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/scope/config.xml");
	Employee emp1=(Employee)context.getBean("emp1");
	Employee emp2=(Employee)context.getBean("emp1");
	System.out.println(emp1);
	System.out.println(emp2);
	emp1.setName("Hosi");
	System.out.println(emp1);
	System.out.println(emp2);
	}
}
