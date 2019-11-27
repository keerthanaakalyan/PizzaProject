package com.pizza.exception;

public class PizzaException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString(){
		return "The exception occured due to network disconnectivity";
	}
}
