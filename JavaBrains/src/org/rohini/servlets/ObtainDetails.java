package org.rohini.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ObtainDetailsPath")
public class ObtainDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection=DatabaseConnection.getconnection();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		
		ObtainDetailsBusinessClass odbc=new ObtainDetailsBusinessClass();
		boolean obtain=odbc.ObtainDetailsMethod(firstName, lastName);
		if(obtain){
			String query="select * from student_form where first_name=? and last_name=?";
			try {
				PreparedStatement ps=connection.prepareStatement(query);
				ps.setString(1, firstName);
				ps.setString(2, lastName);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					String first_name=rs.getString("first_name");
					String last_name=rs.getString("last_name");
					String middle_name=rs.getString("middle_name");
					String gender=rs.getString("gender");
					String major=rs.getString("major");
					String minor=rs.getString("minor");
					String hobby=rs.getString("hobby");
					String remarks=rs.getString("remarks");
					
					request.setAttribute("first_name",first_name);
					request.setAttribute("last_name",last_name );
					request.setAttribute("middle_name", middle_name);
					request.setAttribute("gender", gender);
					request.setAttribute("major", major);
					request.setAttribute("minor", minor);
					request.setAttribute("hobby", hobby);
					request.setAttribute("remarks", remarks);
				}
				RequestDispatcher rd=request.getRequestDispatcher("ObtainDetails.jsp");
				rd.forward(request, response);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("Student_Registration_Form.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
