package com.seleniumexpress.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.entity.AadharCard;
import com.seleniumexpress.entity.customer;

public class Test {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		SessionFactory buildSessionFactory = configuration
				.configure()
				.addAnnotatedClass(customer.class)
				.addAnnotatedClass(AadharCard.class)
				.buildSessionFactory();
		Session session = buildSessionFactory.openSession();

		session.beginTransaction();
		
		/*
		 * AadharCard aadharcard = new AadharCard(); aadharcard.setAadharnumber(123456);
		 * 
		 * customer customer = new customer(); customer.setName("Bala Guravaiah");
		 * customer.setCountry("India"); customer.setAadharcard(aadharcard);
		 * session.save(customer);
		 */
		
		customer customer = session.get(customer.class, 1);
		System.out.println("customer id is : "+ customer.getId() +" and the customer name is " + customer.getName());
		
		
//		customer customer = session.get(customer.class, 4);
//		session.remove(customer);
//		AadharCard aadharCard = session.get(AadharCard.class, 2);
//		customer customer = aadharCard.getCustomer();
//		customer.setAadharcard(null);
//		session.delete(aadharCard);
		
		session.getTransaction().commit();
		session.close();

	}

}
