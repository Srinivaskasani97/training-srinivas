package com.motivity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLSelect {

	public static void main(String[] args) {
		
		Configuration cf = new Configuration();
		cf.configure("Configuration.xml");
		
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		
		Query qr = se.createQuery("from StudentPOJO s");
		List<StudentPOJO> li = qr.list();
		Iterator<StudentPOJO> i = li.iterator();
		
		while(i.hasNext())	{
			StudentPOJO s = i.next();
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()); 
		}
		
		
		
		
		se.close();
		sf.close();
	}

}