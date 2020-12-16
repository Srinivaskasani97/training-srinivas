package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MergeMethod {
	
	public static void main(String args[]) {

		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");

		SessionFactory sf = cf.buildSessionFactory();
		Session se1 = sf.openSession(); // starting session one

		StudentPOJO s = new StudentPOJO();
		s.setId(106);
		s.setName("rohit");
		s.setMarks(750);

		se1.save(s); // save student object to database
		Transaction tx1 = se1.beginTransaction();
		tx1.commit(); // commit the transaction

		se1.close(); // closing the session one

		Session se2 = sf.openSession(); // starting session two
		s.setName("rohit kumar");

		
		se2.merge(s);
		Transaction tx2 = se2.beginTransaction();
		tx2.commit(); // commit the transaction

		se2.close(); // close the session two
		sf.close();
	}
}
