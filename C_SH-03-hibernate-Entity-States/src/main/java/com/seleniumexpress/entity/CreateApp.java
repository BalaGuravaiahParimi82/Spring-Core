package com.seleniumexpress.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project.song;
import com.seleniumexpress.utils.HibernateUtils;

public class CreateApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactory();

		// Initialize the session object
		Session session = sessionfactory.openSession();
		song song = new song(); // Transient State - There is no relation between song and session
		song.setSinger("Priyanka");
		song.setSongId(4);
		song.setSongName("Lover");

		session.beginTransaction();
		session.save(song); // Persistent State - There is link between database(session) and song object
		session.getTransaction().commit();
		System.out.println("song saved check db");
		session.close(); // Detached state link is closed between song and session(session closed)

	}

}
