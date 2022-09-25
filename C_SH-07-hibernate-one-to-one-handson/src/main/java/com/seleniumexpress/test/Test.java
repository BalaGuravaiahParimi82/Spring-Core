package com.seleniumexpress.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.entity.AccessCard;
import com.seleniumexpress.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory buildSessionFactory = configuration.configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(AccessCard.class).buildSessionFactory();
		Session session = buildSessionFactory.openSession();

		session.beginTransaction();

		session.getTransaction().commit();
		session.close();

	}

}
