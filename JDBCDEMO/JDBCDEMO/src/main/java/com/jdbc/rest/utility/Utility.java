package com.jdbc.rest.utility;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

/**
 * 
 * @author sushant.temkar Utility for maintaining common code in application
 */

@Component
public class Utility {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc?useSSL=false", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}
