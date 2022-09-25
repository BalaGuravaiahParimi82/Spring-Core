package com.seleniumexpress.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee1 {
	
	@Id
	private int id;
	
	private String name;
	
	private String country;
	
	private AccessCard1 accessCard;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public AccessCard1 getAccessCard() {
		return accessCard;
	}
	public void setAccessCard(AccessCard1 accessCard) {
		this.accessCard = accessCard;
	}
	
}
