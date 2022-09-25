package com.seleniumexpress.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.song;
import com.seleniumexpress.utils.HibernateUtils;

public class UpdateApp {

	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactory();

		// Initialize the session object
		Session session = sessionfactory.openSession();

		session.beginTransaction();
		song song = new song();
		song.setSongId(1);
		song.setSongName("This is small lettes updated");
		session.update(song);
		session.getTransaction().commit();

	}

}
