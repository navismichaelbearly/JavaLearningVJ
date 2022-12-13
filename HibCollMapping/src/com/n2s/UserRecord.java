package com.n2s;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file

		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();
		
		Set<Contact> phnum = new HashSet<Contact>();
		
		phnum.add(new Contact("1234"));
		phnum.add(new Contact("5678"));
		phnum.add(new Contact("3412"));
		
		User u = new User("Drashti", phnum);
		
		session.persist(u);
		t.commit();
		
		System.out.println("Data Inserted");
	}

}
