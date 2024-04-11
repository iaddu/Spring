package com.spring.jdbc.drive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.Dao.StudentDaoImp;
import com.spring.jdbc.entities.Student;



public class Drive {
	public static void main(String ar[]) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/drive/config.xml");
	 StudentDaoImp sdi=(StudentDaoImp)context.getBean("studentDaoImp");
	 Student std1=new Student();
	 std1.setId(131);
	 std1.setCity("Usa");
	 std1.setName("Delta");
	 int result=sdi.cancel(131);
	 System.out.println(result);
	}
}
