package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive {
	public static void main(String ar[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spEL/config.xml");
	Employee emp1=(Employee)context.getBean("emp1");
	System.out.println(emp1);
	}
}
