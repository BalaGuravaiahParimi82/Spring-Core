package com.seleniumexpress.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.entity.Student;
import com.seleniumexpress.entity.passport;

public class Test {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory buildSessionFactory = configuration
				.configure()
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(passport.class)
				.buildSessionFactory();
		Session session = buildSessionFactory.openSession();

		session.beginTransaction();
		session.getTransaction();
		passport passport = session.get(passport.class, 1008);
//		Student student = new Student();
//		student.setStudent_name("Abhilash updated");
//		student.setCountry("India1");
		System.out.println(passport);

		/*
		 * passport passport = new passport(); passport.setPassport_id(1004);
		 * passport.setPassport_number("01HW870920 updated");
		 * student.setPassport(passport);
		 */
//		session.delete(student);
		session.getTransaction().commit();
		session.close();

	}

}
