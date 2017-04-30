package org.rohini.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Factorial
 */
@WebServlet("/FactorialPath")
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String number = request.getParameter("num_fact");
		Factorial_Business_class fbc=new Factorial_Business_class();
		boolean is_Number = fbc.isNumber(number);
		if(is_Number){
			request.setAttribute("num", number);
			RequestDispatcher rd=request.getRequestDispatcher("/FactorialResultPath");
			rd.forward(request, response);
			return;
		}
		else{
			response.sendRedirect("Factorial.jsp");
			return;
		}
	}

}
