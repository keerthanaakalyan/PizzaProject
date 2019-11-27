package com.pizza.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer")
public class Customer {
	@Column(name="custName")
	 @NotEmpty(message="custname cannaot be empty")
	private String custName;
	@Id //this is id column
	@GeneratedValue(strategy=GenerationType.AUTO) // the id is auto incremented
	@Column(name="customerId")
	private int custId;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name="address")
	private String address;
	@Column(name="phone")
	private String phone;
	
	public String toString(){
		return custId+" "+custName+" "+address+" "+phone;
	}
}
