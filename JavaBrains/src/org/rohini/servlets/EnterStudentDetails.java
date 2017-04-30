package org.rohini.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnterStudentDetails
 */
@WebServlet("/EnterStudentDetailsPath")
public class EnterStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection=DatabaseConnection.getconnection();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name=request.getParameter("firstName");
		String last_name=request.getParameter("lastName");
		String middle_name=request.getParameter("middleName");
		String gender=request.getParameter("Gender");
		String major=request.getParameter("Major");
		String minor=request.getParameter("Minor");
		String hobby=request.getParameter("Hobby");
		String remarks=request.getParameter("remarks");
		
		
		String query="insert into student_form(first_name,last_name,middle_name,gender,major,minor,hobby,remarks) values(?,?,?,?,?,?,?,?)";
		//String query2="commit";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			ps.setString(3, middle_name);
			ps.setString(4, gender);
			ps.setString(5, major);
			ps.setString(6,minor);
			ps.setString(7,hobby);
			ps.setString(8, remarks);
			ps.executeUpdate();
			//ps=connection.prepareStatement(query2);
			RequestDispatcher rd=request.getRequestDispatcher("EnterStudentDetails.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
