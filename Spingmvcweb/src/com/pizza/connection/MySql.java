package com.pizza.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySql {
    static Connection c;
	public static Connection getCon() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(c==null){
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			System.out.println("connect "+c);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return c;
	}
   public static  Connection closing() throws SQLException{
	   c.close();
	   return null;
   }
//	StringBuilder sb=new StringBuilder("abc");

}
