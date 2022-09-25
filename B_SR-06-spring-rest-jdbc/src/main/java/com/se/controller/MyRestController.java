package com.se.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.se.config.dao.EmployeeDAO;
import com.se.model.Employee;
import com.se.model.EmployeeResponse;

@RestController
public class MyRestController {
	
	@Autowired
	private EmployeeDAO employeedao;
	
	
	@GetMapping("/employee")
	public ResponseEntity <List<Employee>> findAllEmployees()
	{
		
		List<Employee> allEmployees = employeedao.getAllEmployees();
		
		return new ResponseEntity<>(allEmployees, HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeResponse> InsertEmployeeData(@RequestBody Employee employee)
	{
		EmployeeResponse employeeresponse = new EmployeeResponse();
		Employee insertEmployeedetails = employeedao.InsertEmployeedetails(employee);
		
		if(insertEmployeedetails.getEmployeeId()!=0)
		{
		 employeeresponse.setAge(insertEmployeedetails.getAge());
		 employeeresponse.setEmployeeName(insertEmployeedetails.getEmployeeName());
		}
		
		return new ResponseEntity<>(employeeresponse, HttpStatus.OK);
		
	}
	
	@PutMapping(value="/employee/{id}")
	public ResponseEntity<EmployeeResponse> updateEmployeeId(@RequestBody Employee employee, @PathVariable int id)
	{
		
		EmployeeResponse response = new EmployeeResponse();
		Employee updatedemployee = employeedao.updatedata(employee, id);
		if(updatedemployee.getEmployeeId()!=0) {
			response.setAge(updatedemployee.getAge());
			response.setEmployeeName(updatedemployee.getEmployeeName());
			
		}
		return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
		
	}

}
