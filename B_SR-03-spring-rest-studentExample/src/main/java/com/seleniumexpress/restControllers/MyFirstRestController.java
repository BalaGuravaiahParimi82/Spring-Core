package com.seleniumexpress.restControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seleniumexpress.api.Student;

@RestController
public class MyFirstRestController {

	@GetMapping(value = "/student")
	public Student studentData() {

		Student student = new Student();
		student.setId(1);
		student.setCountry("India");
		student.setName("Lavanya");
		return student;
	}
}
