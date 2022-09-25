package com.se.model;

public class EmployeeResponse {
	
	private String EmployeeName;
	private int age;
	
	
	
	public EmployeeResponse(String employeeName, int age) {
		this.EmployeeName = employeeName;
		this.age = age;
	}
	public EmployeeResponse() {
		// TODO Auto-generated constructor stub
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
	
	

}
