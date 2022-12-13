package com.n2s;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //creating configuration object  
        Configuration cfg=new Configuration();  
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
          
        //creating seession factory object  
        SessionFactory factory=cfg.buildSessionFactory();  
          
        //creating session object  
        Session session=factory.openSession();  
          
        //creating transaction object  
        Transaction t=session.beginTransaction();  
        /*
        Login login = new Login();
        login.setId(8);
        login.setPwd("secret");
        login.setUname("mn");
        session.persist(login);
        t.commit();
        System.out.println("Data inserted");
        */
        try{
            
            List users = session.createQuery("FROM Login").list(); 
            for (Iterator iterator = users.iterator(); iterator.hasNext();){
               Login l1 = (Login) iterator.next(); 
               System.out.print("User Name: " + l1.getUname()); 
               System.out.print("   Password: " + l1.getPwd()); 
               System.out.println("  Id:er " + l1.getId()); 
            }
            t.commit();
         }catch (HibernateException e) {
           
            e.printStackTrace(); 
         }
        //if there is more exception how we handle.
        
	}

}
