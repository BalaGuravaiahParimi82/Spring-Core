package com.se.config.dao;

import java.util.List;

import com.se.model.Employee;
import com.se.model.EmployeeResponse;

public interface EmployeeDAO {
	
	public List<Employee> getAllEmployees() ;

	public Employee InsertEmployeedetails(Employee employee);

	public Employee updatedata(Employee employee, int id);

}
