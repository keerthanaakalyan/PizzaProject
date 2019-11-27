package com.pizza.service;

import java.sql.SQLException;


import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.exception.NoOrderId;
import com.pizza.exception.PizzaException;

public interface IPizzaOrderService {
	public int placeOrder(Customer customer,PizzaOrder pizza,int pTopping);
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException;
	public Customer getCustomerDetails(int orderId);
	public int updateOrder(Customer c) throws NoOrderId;
	public int deleteOrder(PizzaOrder po) throws NoOrderId;
}
