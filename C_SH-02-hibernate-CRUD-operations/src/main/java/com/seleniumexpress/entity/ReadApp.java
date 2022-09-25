package com.seleniumexpress.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.song;
import com.seleniumexpress.utils.HibernateUtils;

public class ReadApp {
	
	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactory();

		// Initialize the session object
		Session session = sessionfactory.openSession();
		
		session.beginTransaction();
		song song = session.get(song.class, 2);
		session.getTransaction().commit();
		System.out.println(song);

	}

}
