package com.seleniumexpress.restControllers.exception;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends Exception {
	
	public StudentNotFoundException(String string) {
		super(string);
		
	}
	

}
