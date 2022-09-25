package com.seleniumexpress.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.Address;
import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.Student;
import com.seleniumexpress.utils.HibernateUtils;

public class CreateApp {

	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactory();

		Session openSession = sessionfactory.openSession();


		Address address = new Address();
		address.setAddressline1("address line 1");
		address.setAddressline2("address line 2");
		address.setCity("city");
		address.setCountry("country name");
		
		Student student = new Student();
		student.setId(2);
		student.setMobile(123);;
		student.setName("Abhlilash");

		student.setAddress(address);

		openSession.beginTransaction();
		openSession.save(student);
		openSession.getTransaction().commit();
		
		openSession.close();

	}

}
