package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersistMethod {
	

	public static void main(String args[]) {
	
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		StudentPOJO s = new StudentPOJO();
		s.setId(105);
		s.setName("sudigali");
		s.setMarks(555);
		
		se.persist(s);
		
		Transaction tx = se.beginTransaction();
		tx.commit();
		
		se.close();
		sf.close();
	}
}
