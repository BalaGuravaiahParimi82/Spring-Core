package com.seleniumexpress.test;

import org.hibernate.SessionFactory;

import com.seleniumexpress.utils.HibernateUtils;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();

		SessionFactory sessionFactory2 = HibernateUtils.getSessionFactory();

		System.out.println(sessionFactory1 + " " + sessionFactory2);

	}
}
