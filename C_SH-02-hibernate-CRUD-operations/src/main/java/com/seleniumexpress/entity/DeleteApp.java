package com.seleniumexpress.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.song;
import com.seleniumexpress.utils.HibernateUtils;

public class DeleteApp {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory = HibernateUtils.getSessionFactory();
		
		Session session = sessionfactory.openSession();
		song song = session.get(song.class, 1);
		session.beginTransaction();
		
		session.delete(song);
		session.getTransaction().commit();

	}

}
