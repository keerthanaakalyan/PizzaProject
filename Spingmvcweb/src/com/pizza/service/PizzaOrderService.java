package com.pizza.service;

import java.sql.SQLException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.exception.NoOrderId;
import com.pizza.exception.PizzaException;

import com.pizza.DAO.IPizzaOrderDAOImpl;
import com.pizza.util.Topping;

public class PizzaOrderService implements IPizzaOrderService{
	@Autowired
	 private  IPizzaOrderDAOImpl pizzaImpl;
	
	
		public PizzaOrder getOrderDetails(int orderid)throws PizzaException{
		try 
			{  
			 //pizzaImpl=new IPizzaOrderDAOImpl();
			PizzaOrder pizza=pizzaImpl.getOrderDetails(orderid);
			return pizza;
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
}

		public int placeOrder(Customer customer, PizzaOrder pizza, int pTopping) {
			//pizza.setTotalPrice(350+pTopping);
			try 
			{  
			 //pizzaImpl=new IPizzaOrderDAOImpl();
			int res=pizzaImpl.placeOrder(customer, pizza,350+ pTopping);
			return res;
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return 0;
		}

		public Customer getCustomerDetails(int orderId) {
			try 
			{  
			 //pizzaImpl=new IPizzaOrderDAOImpl();
			Customer cust=pizzaImpl.getCustomerDetails(orderId);
			return cust;
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		}

		public int updateOrder(Customer c) throws NoOrderId {
			try 
			{  
			 //pizzaImpl=new IPizzaOrderDAOImpl();
			int res=pizzaImpl.updateOrder(c);
			return res;
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return 0;
		}

		public int deleteOrder(PizzaOrder po) throws NoOrderId {
			try 
			{  
			 //pizzaImpl=new IPizzaOrderDAOImpl();
			int res=pizzaImpl.deleteOrder(po);
			return res;
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return 0;
		}

		
}


