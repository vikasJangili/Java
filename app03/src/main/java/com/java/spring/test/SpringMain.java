package com.java.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.beans.Student;

public class SpringMain {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("Springconfig.xml");
	Student student =  (Student)context.getBean("studentBean");
	student.printDetails();
	
	}

}
