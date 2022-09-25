package com.seleniumexpress.restControllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.api.StudentErrorResponse;
import com.seleniumexpress.api.dao.StudentDAO;
import com.seleniumexpress.restControllers.exception.StudentNotFoundException;

@RestController
public class MyFirstRestController {
 
	private static final Student Student = null;
	@Autowired
	private StudentDAO studentDAO;

	@GetMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> studentData() {

		List<Student> allStudent = studentDAO.getAllStudent();

		return ResponseEntity.status(HttpStatus.OK).body(allStudent);
	}
	
	@GetMapping(value = "/student/{id}")
	public Student getStudent(@PathVariable int id) throws Exception {
		if(id > studentDAO.findStudentListSize())
		{
			throw new StudentNotFoundException("id not found");
		}
		System.out.println("Fetching student id");
		Student student = studentDAO.getStudentDataById(id);
		return student;

	}
	

	// create a uri -> /student/{name}
	// return him complete student object
//	@GetMapping(value = "/student/{name}", params = "yyy")
//	public Student getStudentByName(@PathVariable String name) {
//		System.out.println("finding student with name");
//		Student studentByName = studentDAO.getStudentDataByName(name);
//		return studentByName;
//
//	}
	
//	@PostMapping("/student")
//	public Student saveStudent(@RequestParam ("id") int id,
//							   @RequestParam("name") String name,
//							   @RequestParam("Country") String Country)
//	{
//		System.out.println("saving student details");
//		Student student = new Student();
//		student.setId(id);
//		student.setName(name);
//		student.setCountry(Country);
//		studentDAO.saveStudentData(student); 
//		 
//		return student;
//		
//	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
		System.out.println(student);
		studentDAO.saveStudentData(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(student);
		
	}
	
	
	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	ResponseEntity<StudentErrorResponse> handleStudentNotFoundException(StudentNotFoundException snf)
	{
		
		System.out.println("Inside exception handler method");		
		StudentErrorResponse errorResponse = new StudentErrorResponse();	
		errorResponse.setDate(new Date());
		errorResponse.setErrorclass(getClass().getName());
		errorResponse.setErrormessage(snf.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(errorResponse);
		
	}
	
	@PutMapping(value = "/student/{id}")
	public ResponseEntity<Student> updateStudent(
							  @PathVariable int id,
			                  @RequestBody Student student)
	{
		
		Student updateStudent = studentDAO.updateStudent(id, student);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(updateStudent);
		
	}
	
	@DeleteMapping(value = "/student/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable int id)
	{
		
		Student deleteStudent = studentDAO.deleteStudent(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(deleteStudent);
		
	}

}
