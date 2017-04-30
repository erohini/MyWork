package org.hibernate.rohini;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.UserDetails;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserID(1);
		user.setUserName("First User");
		user.setJoinedDate(new Date());
		user.setAddress("User 1's address");
		user.setDescription("User 1's description....");
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}

}
