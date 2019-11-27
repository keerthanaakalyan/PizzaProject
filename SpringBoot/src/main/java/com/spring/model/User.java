package com.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@SuppressWarnings("serial")
@JsonIgnoreProperties({"hibernateLazyIntializer","handler"})
@XmlRootElement
@XmlType(propOrder={"userId","userName","password"})
@Entity
@Table(name="user")
public class User implements Serializable{
	@Id //this is id column
	@Column(name="userId",length=5)
	
   private int userId;
	@Column(name="userName",length=25)
   private String userName;
	@Column(name="password",length=25)
   private String password;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String userName, String password) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.password = password;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
   
}
