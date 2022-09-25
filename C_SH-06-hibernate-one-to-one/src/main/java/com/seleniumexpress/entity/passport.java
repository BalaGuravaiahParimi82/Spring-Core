package com.seleniumexpress.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "passport")
public class passport {

	@Id
	@Column(name = "passport_id")
	private int passport_id;

	@Column(name = "passport_number")
	private String passport_number;

	@OneToOne(mappedBy = "passport")
	private Student student;

	public int getPassport_id() {
		return passport_id;
	}

	public void setPassport_id(int passport_id) {
		this.passport_id = passport_id;
	}

	public String getPassport_number() {
		return passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "passport [passport_id=" + passport_id + ", passport_number=" + passport_number + ", student=" + student
				+ "]";
	}

}
