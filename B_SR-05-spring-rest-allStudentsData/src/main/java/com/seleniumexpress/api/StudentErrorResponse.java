package com.seleniumexpress.api;

import java.util.Date;

public class StudentErrorResponse {
	
	private Date date ;
	private String errormessage;
	private String errorclass;
	
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	public String getErrormessage() {
		return errormessage;
	}
	
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	
	public String getErrorclass() {
		return errorclass;
	}
	
	public void setErrorclass(String errorclass) {
		this.errorclass = errorclass;
	}
	
}
