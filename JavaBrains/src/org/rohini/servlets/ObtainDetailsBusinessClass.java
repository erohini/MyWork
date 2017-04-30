package org.rohini.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

public class ObtainDetailsBusinessClass {

	Connection connection=DatabaseConnection.getconnection();
	public boolean ObtainDetailsMethod(String firstName,String lastName) {
		String query="select * from student_form where first_name=? and last_name=?";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

}
