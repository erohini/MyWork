package org.rohini.servlets;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static Connection getconnection(){
		
		Connection connection = null;
		try{
			//load Drivers
			Class.forName("oracle.jdbc.OracleDriver");
			
			// Establish Connection
			connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","hr","hr");
			//System.out.println("Connected database successfully...");
			
		}catch(Exception e){
			e.printStackTrace();
			}
		
		return connection;
	}

	
}
