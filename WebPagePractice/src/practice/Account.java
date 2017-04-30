package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AccountClass")
public class Account extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
    
	JDBCConnection jdbcConnection = new JDBCConnection();
	Connection connection;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	connection = JDBCConnection.getConnection();
	}
	
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h2 align=center>Login Page</h2>");
		
		String username = (String) request.getAttribute("username");
		String validated=(String) request.getAttribute("validated");
		
		if(validated=="true"){
			String query = "select * from register where username=?";
			
			PreparedStatement ps;
			try {
				ps = connection.prepareStatement(query);
				ps.setString(1,username);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()){
					out.println("Username: "+rs.getString("username"));
					out.println("<br>");
					out.println("First name: "+rs.getString("first_name"));
					out.println("<br>");
					out.println("Last Name: "+rs.getString("last_name"));
					out.println("<br>");
					out.println("DOB: "+rs.getString("dob"));
					out.println("<br>");
					out.println("Phone Number: "+rs.getString("phone_number"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		out.println("</body></html>");	
		
	}
	
	@Override
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
