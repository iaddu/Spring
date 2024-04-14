package com.spring.orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao=(StudentDao)context.getBean("studentDao");
    	System.out.println("********Welcome to Spring ORM Project *****");
    	boolean go=true;
    	while(go) {
    	System.out.println("Press 1 : To add New Student");
    	System.out.println("Press 2 : To dispaly all students");
    	System.out.println("Press 3 : to get detial of single student");
    	System.out.println("Press 4 : to delete Student ");
    	System.out.println("Press 5 : to update student");
    	System.out.println("Press 6 : to exit");
    	InputStreamReader i =new InputStreamReader(System.in);
    	BufferedReader br=new BufferedReader(i);
	    int input=Integer.parseInt(br.readLine());
	    switch(input) {
	    case 1:{
	    	System.out.println("enter id of student :");
	    	int id=Integer.parseInt(br.readLine());
	    	System.out.println("enter name of student: ");
	    	String name=br.readLine();
	    	System.out.println("enter city of student :");
	    	String city=br.readLine();
	    	Student student=new Student(id,name,city);
	    	studentDao.insert(student);
	    	System.out.println("insertion succesfull");
	    	break;
	    }
	    case 2:{
	    	List<Student> ls=studentDao.getAllStudents();
	    	System.out.println(ls);
	    	break;
	    }
	    case 3:{
	    	System.out.println("enter id");
	    	int id=Integer.parseInt(br.readLine());
	    	Student student=studentDao.getStudent(id);
	    	System.out.println(student);
	    	break;
	    }
	    
	    case 4:{
	    	System.out.println("enter id");
	    	int id=Integer.parseInt(br.readLine());
	    	studentDao.deleteById(id);
	    	break;
	    }
	    case 5:{
	    	System.out.println("enter id");
	    	int id=Integer.parseInt(br.readLine());
	    	System.out.println("enter student name");
	    	String name=br.readLine();
	    	System.out.println("enter city of student :");
	    	String city=br.readLine();
	    	Student student=new Student(id,name,city);
	    	studentDao.updateStudent(new Student(id,name,city));
	    	break;
	    }
	    case 6:{
	    	go=false;
	    	System.out.println("Auf wiedersehen!");
	    	break;
	    }
	    }
    }
    
}
}
