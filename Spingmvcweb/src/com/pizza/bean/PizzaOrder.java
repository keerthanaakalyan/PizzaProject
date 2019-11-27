package com.pizza.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pizzaorder")
public class PizzaOrder {
	@Id //this is id column
	@GeneratedValue(strategy=GenerationType.AUTO) // the id is auto incremented
	@Column(name="orderId")
	private int orderId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name="price")
	private double totalPrice;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId" )
	private Customer cd;
	public Customer getCd() {
		return cd;
	}
	public void setCd(Customer cd) {
		this.cd = cd;
	}
	public String toString(){
		return "orderId:"+orderId+" "+"customerId:"+cd.getCustId()+" "+"Price:"+totalPrice;
	}
}
