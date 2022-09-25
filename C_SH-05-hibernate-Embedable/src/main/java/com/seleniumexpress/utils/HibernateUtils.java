package com.seleniumexpress.utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.Student;
import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.song;

public class HibernateUtils {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() throws HibernateException {

		if (sessionFactory == null) {
			// configuration
			sessionFactory = new Configuration()
					.configure()
					.addAnnotatedClass(Student.class)
					.buildSessionFactory();
		}
		return sessionFactory;

	}

}
