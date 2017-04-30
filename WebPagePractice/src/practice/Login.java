package practice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LoginClass")
public class Login extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	JDBCConnection jdbcConnection = new JDBCConnection();
	Connection connection;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	connection = JDBCConnection.getConnection();
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password = request.getParameter("password");
		
		String query = "select * from register where username=?";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()){
				String DBPassword = rs.getString("password");
				if(DBPassword.equals(password)){
					request.setAttribute("username",username);
					request.setAttribute("validated", "true");
					RequestDispatcher dispatcher = request.getRequestDispatcher("AccountClass");
					dispatcher.forward(request, response);
				}
				else{
					RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
					dispatcher.forward(request, response);
				}
			}
			else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
				dispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
