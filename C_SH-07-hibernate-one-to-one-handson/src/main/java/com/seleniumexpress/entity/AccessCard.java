package com.seleniumexpress.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AccessCard {
	
	@Id
	private int id;
	
	private int accessCardNumber;
	
	@OneToOne
	private Employee employee;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccessCardNumber() {
		return accessCardNumber;
	}
	public void setAccessCardNumber(int accessCardNumber) {
		this.accessCardNumber = accessCardNumber;
	}

}
