package com.seleniumexpress.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AadharCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int aadharnumber;
	
	@OneToOne(mappedBy = "aadharcard" , 
			cascade = {CascadeType.DETACH, 
					    CascadeType.MERGE,
					    CascadeType.REFRESH, 
					    CascadeType.PERSIST})
	private customer customer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(int aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public customer getCustomer() {
		return customer;
	}
	public void setCustomer(customer customer) {
		this.customer = customer;
	}

}
