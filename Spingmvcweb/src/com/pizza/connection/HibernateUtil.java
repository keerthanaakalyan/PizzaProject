package com.pizza.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory  sessionFactory;
       static{
    	   try{
    		    sessionFactory = new Configuration().configure().buildSessionFactory();
    	   }catch(Throwable e){
    		   System.out.println(e);
    	   }
       }
       public static Session getSession(){
    	   Session session=sessionFactory.openSession();
    	   return session;
       }
     
}
