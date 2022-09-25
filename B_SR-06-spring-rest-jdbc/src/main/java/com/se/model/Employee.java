package com.se.model;

public class Employee {
	
	private int employeeId;
	private String EmployeeName;
	private int age;
	
	public Employee(int empid, String empName, int empAge) {
		
		this.employeeId = empid;
		this.EmployeeName = empName;
		this.age = empAge;
		
	}
	public Employee() {
		
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Employee [employeeId=%s , EmployeeName=%s, age=%s]",employeeId, EmployeeName, age );
	}
	
	

}
