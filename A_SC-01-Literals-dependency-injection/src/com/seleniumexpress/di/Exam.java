package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args)
	{
		  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		  System.out.println("Config loaded");
		  
		  Student abhilash= context.getBean("student", Student.class);
		  abhilash.displayStudentInfo();
		  Student dilip= context.getBean("dilip", Student.class);
		  dilip.displayStudentInfo();
		 
		/*
		 * Student abhi = new Student(1, "Abhi"); abhi.displayStudentInfo();
		 */
	}

}
