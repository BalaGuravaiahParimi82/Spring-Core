package com.seleniumexpress.api;
 
public class Student {
	private int id;
	private String name;;
	private String country;
	private BatchInfo batchInfo;

	public BatchInfo getBatchInfo() {
		return batchInfo;
	}

	public void setBatchInfo(BatchInfo batchInfo) {
		this.batchInfo = batchInfo;
	}

	public Student(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public Student() {
		
	}

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

}
