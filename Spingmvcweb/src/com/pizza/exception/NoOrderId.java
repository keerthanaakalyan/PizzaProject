package com.pizza.exception;

public class NoOrderId extends Exception{
	private static final long serialVersionUID = 1L;

	public String toString(){
		return "There is no order id ";
	}

}
