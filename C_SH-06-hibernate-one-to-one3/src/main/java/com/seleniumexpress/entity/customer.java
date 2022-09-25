package com.seleniumexpress.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Country;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private AadharCard aadharcard;

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
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public AadharCard getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(AadharCard aadharcard) {
		this.aadharcard = aadharcard;
	}

}
