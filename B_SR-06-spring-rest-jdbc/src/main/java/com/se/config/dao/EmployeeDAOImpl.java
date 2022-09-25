package com.se.config.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.se.model.Employee;
import com.se.model.EmployeeResponse;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllEmployees() {
		
		String sql = "SELECT * FROM employee_data.employees";
		List<Employee> employees = jdbcTemplate.query(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				int empid = rs.getInt("emp_id"); // same as database row name
				String empName = rs.getString("emp_name");
				int empAge = rs.getInt("emp_age");
				
				Employee employee = new Employee(empid, empName, empAge );				
				
				return employee;
			}
		});
		
		return employees;
	}

	@Override
	public Employee InsertEmployeedetails(Employee employee) {
		
		Employee ret = null;
		
		String sql = "INSERT INTO employees values(?,?,?)";
		Object[] args = {employee.getEmployeeId(), employee.getEmployeeName(), employee.getAge() };
		int result = jdbcTemplate.update(sql, args);
		
		if(result ==1)
		{
			ret = employee;
			return ret;
		}
		
		return ret;
	}

	@Override
	public Employee updatedata(Employee employee, int id) {
		
		Employee ret = new Employee();
		String sql = "UPDATE employees SET emp_name = ?, emp_age = ? WHERE emp_id = ? ";
		Object [] args = {employee.getEmployeeName(), employee.getAge()};
		int result = jdbcTemplate.update(sql, args);
		if(result == 1) {
			ret=employee;
		}
		return ret;
	}

	
	
}
