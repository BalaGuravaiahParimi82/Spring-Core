package com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

//@Embeddable
public class Address {
	
	@Column(name = "addressline1")
	public String addressline1;
	@Column(name = "addressline2")
	public String addressline2;
	@Column(name = "city")
	public String city;
	@Column(name = "country")
	public String country;

	public Address() {
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}