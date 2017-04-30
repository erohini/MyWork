package com.banking;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setCustomer_Name("Sai Ram");
		cust.setCity("Swargalokam");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(cust);
		session.getTransaction().commit();
	}

}
