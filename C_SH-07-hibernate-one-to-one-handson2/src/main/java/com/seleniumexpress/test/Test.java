package com.seleniumexpress.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.entity.AccessCard1;
import com.seleniumexpress.entity.Employee1;

public class Test {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory buildSessionFactory = configuration
				.configure()
				.addAnnotatedClass(Employee1.class)
				.addAnnotatedClass(AccessCard1.class)
				.buildSessionFactory();
		Session session = buildSessionFactory.openSession();

		session.beginTransaction();

		session.getTransaction().commit();
		session.close();

	}

}
