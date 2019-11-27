package com.pizza.DAO;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.pizza.connection.HibernateUtil;
import com.pizza.connection.MySql;
import com.pizza.exception.NoOrderId;
import com.pizza.exception.PizzaException;
import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;

public class IPizzaOrderDAOImpl implements IPizzaOrderDAO {
	@Autowired
	 private SessionFactory sessions;
	
	@Autowired
	PizzaOrder pizzaorder;
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException {
		 String hqlQuery="from PizzaOrder where id=:Id";
   		 Session session = sessions.openSession();
   	  Query query=session.createQuery(hqlQuery);
   	 query.setParameter("Id", orderid);
   	Iterator it=query.iterate();
	 // PizzaOrder pizzaorder=new PizzaOrder();
	
	     try{
	    	 if(it.hasNext()){
	    		 
	   		  pizzaorder =(PizzaOrder)it.next(); 
	   		 // System.out.println(pizzaorder.getCustomerId());
	      	// session.close();
	   		return pizzaorder;
	     }else{
	    	 throw new NoOrderId();
	     }
	     }catch(Exception e){
	    	 e.printStackTrace();
	     }
	     session.close();
	     
	    return null;
	}

	
	

	public int placeOrder(Customer cust, PizzaOrder pizza, int pTopping) {
		Transaction tx=null;
	   	  Session session = sessions.openSession();;
		  tx=session.beginTransaction();
	   	 // int row=(Integer) session.save(cust);
	   	//tx.commit();
	    pizza.setCd(cust);
	    tx=session.beginTransaction();
	    //pizza.setCustomerId(row);
	    pizza.setTotalPrice(pTopping);
	   	  int res=(Integer) session.save(pizza);
	   	  tx.commit();
	   	  session.close();
		/*if(res>0 && row>0){
			return 1;
		}else{
			return 0;
		}*/
	   	  return res;
	}

	public Customer getCustomerDetails(int orderId) {
		 String hqlQuery="from Customer where id=:Id";
   		 Session session = sessions.openSession();;
   	  Query query=session.createQuery(hqlQuery);
   	 query.setParameter("Id", orderId);
   	Iterator it=query.iterate();
	  Customer cust=new Customer();
	
	     try{
	    	 if(it.hasNext()){
	    		 
	   		  cust=(Customer) it.next();
	      	// session.close();
	   		return cust;
	     }else{
	    	 throw new NoOrderId();
	     }
	     }catch(Exception e){
	    	 e.printStackTrace();
	     }
	     
	     session.close();
		return null;
	}

	public int updateOrder(Customer c) throws NoOrderId{
		 Transaction tx=null;
   	  Session session = sessions.openSession();;
 	 tx=session.beginTransaction();
	  String hqlQuery2="update Customer set phone=:ph,custName=:name,address=:addr  where  id=:Id";
	  Query query3=session.createQuery(hqlQuery2);
	  query3.setParameter("Id", c.getCustId());
	  query3.setParameter("ph",c.getPhone());
	  query3.setParameter("addr",c.getAddress());
	  query3.setParameter("name",c.getCustName());
	  int row=query3.executeUpdate();
	  tx.commit();
	session.close();
	  if(row==0)
		  return 0;
		   else
		   return 1;
		
	}

	public int deleteOrder(PizzaOrder pizzaorder) throws NoOrderId{
		Transaction tx=null;
  	  Session session =sessions.openSession();;
		 tx=session.beginTransaction();
	  String hqlQuery="delete from  PizzaOrder  where id=:Id";
	  Query query=session.createQuery(hqlQuery);
	  query.setParameter("Id", pizzaorder.getOrderId());

	  int row=query.executeUpdate();
	tx.commit();
	session.close();
	  if(row==0)
		   return 0;
	  else
		  return 1;
		
	}




	}


