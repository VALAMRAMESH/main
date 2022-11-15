package com.yash.util;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class JDBCUtil {

	 public static PreparedStatement prapPreparedStatement(String sql) {
		
		 try{  
			 Class.forName("com.mysql.cj.jdbc.Driver");  
			String url="jdbc:mysql://localhost:3306/employee";
			
			Connection con = DriverManager.getConnection(url,"root","root");	
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			
			return preparedStatement;
			 
		 }catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
     
		 return null;
	}
	
}
