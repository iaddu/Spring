package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drive 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/config.xml");
    	Student std1=(Student)context.getBean("std1");
    	System.out.println(std1);
    }
}
