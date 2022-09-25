package com.seleniumexpress.valueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student student = applicationContext.getBean("student", Student.class);
		student.display();
		

	}

}
