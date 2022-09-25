package com.seleniumexpress.valueAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.StudentName}")
	private String StudentName;
	
	@Value("${student.PreferredSubject}")
	private String PreferredSubject;
	
	@Value("${student.favoriteHobby}")
	private String favoriteHobby;
	
	public void display()
	{
		System.out.println("Student name is "+ StudentName + " Student Preferred Subject is "+PreferredSubject +" and the student favorite hobby is "+ favoriteHobby);
	}

}
