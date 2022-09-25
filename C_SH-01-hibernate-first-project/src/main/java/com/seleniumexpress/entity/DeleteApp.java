package com.seleniumexpress.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.song;

public class DeleteApp {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(song.class);
		
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		song song = session.get(song.class, 1);
		session.beginTransaction();
		
		session.delete(song);
		session.getTransaction().commit();

	}

}
