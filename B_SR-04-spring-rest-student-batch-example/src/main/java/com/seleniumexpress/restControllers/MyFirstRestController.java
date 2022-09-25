package com.seleniumexpress.restControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seleniumexpress.api.BatchInfo;
import com.seleniumexpress.api.Student;

@RestController
public class MyFirstRestController {

	@GetMapping(value = "/student")
	public Student studentData() {

		BatchInfo batchInfo = new BatchInfo();
		batchInfo.setBatchName("OCP1");
		batchInfo.setTrainer("Abhilash");

		Student student = new Student();
		student.setId(1);
		student.setName("Lavanya");
		student.setCountry("US");

		return student;
	}

}
