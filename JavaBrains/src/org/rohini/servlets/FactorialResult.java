package org.rohini.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactorialResult
 */
@WebServlet("/FactorialResultPath")
public class FactorialResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("FactorialResult");
		 String num=(String) request.getAttribute("num");
		 int number=Integer.parseInt(num);
		 System.out.println(number);
		 int fact=1;
		 for(int i=1;i<=number;i++){
			 fact=fact*i;
		 }
		 request.setAttribute("factorial", fact);
		 RequestDispatcher rd = request.getRequestDispatcher("Factorial_Result.jsp");
		 rd.forward(request, response);
		 
	}

}
