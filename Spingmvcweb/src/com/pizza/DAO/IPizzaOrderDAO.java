package com.pizza.DAO;

import java.sql.SQLException;

import com.pizza.exception.NoOrderId;
import com.pizza.exception.PizzaException;
import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;

public interface IPizzaOrderDAO {
	public int placeOrder(Customer customer,PizzaOrder pizza,int pTopping);
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException;
	public Customer getCustomerDetails(int orderId) ;
	public int updateOrder( Customer customer) throws NoOrderId;
	public int deleteOrder(PizzaOrder po) throws NoOrderId;
	}

