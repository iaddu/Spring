package com.springcore.init_destroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
	 AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/init_destroy/config.xml");
	 Samosa s1=(Samosa)context.getBean("samosa");
	 System.out.println(s1);
	 context.registerShutdownHook();
	}

}
