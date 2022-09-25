package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args)
	{
	
		/*
		 * Student student = new Student(); MathCheat cheat = new MathCheat();
		 * student.setCheat(cheat); student.cheating();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    Student stu = context.getBean("student",Student.class);
		System.out.println("config has been loaded");
		stu.cheating();
		
	}
	

}
