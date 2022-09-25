package com.seleniumexpress.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AccessCard1 {
	
	@Id
	private int id;
	
	private int accesscardnumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAccesscardnumber() {
		return accesscardnumber;
	}
	public void setAccesscardnumber(int accesscardnumber) {
		this.accesscardnumber = accesscardnumber;
	}

}
