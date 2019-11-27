package com.pizza.test;

import static org.junit.Assert.*;



import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pizza.exception.PizzaException;
import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.DAO.IPizzaOrderDAOImpl;
/*
public class PizzaTest {
	 static IPizzaOrderDAOImpl p;
	Customer cust;
	PizzaOrder pizza;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p=new IPizzaOrderDAOImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		p=null;
	}

	@Before
	public void setUp() throws Exception {
		cust=new Customer();
		pizza=new PizzaOrder();
	}

	@After
	public void tearDown() throws Exception {
		cust=null;
		pizza=null;
	}

	@Test
	public void test1() throws PizzaException, SQLException {
		cust.setCustName("amala");
		cust.setAddress("in");
		cust.setPhone("9087653");
		pizza.setTotalPrice(350);
		IPizzaOrderDAOImpl pizzaImpl=new IPizzaOrderDAOImpl();
 	    int place=pizzaImpl.placeOrder(cust,pizza);
 	    assertEquals(1, place);
	}
	@Test
	public void test2() throws PizzaException, SQLException {
		
		IPizzaOrderDAOImpl pizzaImpl=new IPizzaOrderDAOImpl();
 	   int delete=pizzaImpl.deleteOrderDetails(111);
 	    assertEquals(0, delete);
	}
	@Test
	public void test3() throws PizzaException, SQLException {
		
		IPizzaOrderDAOImpl pizzaImpl=new IPizzaOrderDAOImpl();
 	   pizza=pizzaImpl.getOrderDetails(143);
 	    assertNotNull("Ther is an orderid", pizza);
	}
*/
//}
