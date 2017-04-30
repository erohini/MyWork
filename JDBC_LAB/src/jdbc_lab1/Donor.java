package jdbc_lab1;

import java.sql.*;

public class Donor {
	String fName;
	String lName;
	int amount;
	String email;
	
	public String getFName()
	{
		return fName;
	}

	public void setFName(String fName)
	{
		this.fName=fName;
	}
	
	public String getLName()
	{
		return lName;
	}

	public void setLName(String lName)
	{
		this.lName=lName;
	}
	
	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount=amount;
	}
	
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email=email;
	}
	
	
	public static Connection getConnection()
	{
		final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
		   final String DB_URL = "jdbc:oracle:thin:@localhost:1522:orcl";

		   //  Database credentials
		   final String USER = "hr";
		   final String PASS = "hr";
		   
		   Connection connect = null;
		   try{
			   Class.forName("oracle.jdbc.OracleDriver");
			      System.out.println("Connecting to a selected database...");
			      connect = DriverManager.getConnection(DB_URL, USER, PASS);
			      System.out.println("Connected database successfully...");
		   }catch(Exception e){}
		return connect;
	}
	public void createTable()
	{
			Connection connect=Donor.getConnection();
		   Statement stmt = null;
		   try{
		      
		 
		      System.out.println("Creating table in given database...");
		      stmt = connect.createStatement();
		      
		      String sql = "CREATE TABLE DONOR " +
		                   "(FNAME VARCHAR(255), " +
		                   " LNAME VARCHAR(255), " + 
		                   " AMOUNT INT, " +  
		                   " EMAIL VARCHAR(255))"; 

		      stmt.executeUpdate(sql);
		      System.out.println("Created table in given database...");
		   }catch(SQLException se){
		      se.printStackTrace();
		   }catch(Exception e){
		      e.printStackTrace();
		   }finally{
		      try{
		         if(stmt!=null)
		            connect.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(connect!=null)
		            connect.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
		}
	
	public void insertTable(String fn, String ln, int amnt, String em)
	{
		Connection connect=Donor.getConnection();
		Statement stmt=null;
		//Donor donor=new Donor();
		try{
			String sql="INSERT INTO DONOR(FNAME, LNAME, AMOUNT,EMAIL) VALUES(?,?,?,?)";
			PreparedStatement pstmt =connect.prepareStatement(sql);
			//pstmt.executeQuery();
			pstmt.setString(1,fn);
			pstmt.setString(2,ln);
			pstmt.setInt(3, amnt);
			pstmt.setString(4,em);
			pstmt.executeUpdate();
			
			pstmt.close();
		}catch(SQLException se){
		      se.printStackTrace();
		   }finally{
		      try{
		         if(stmt!=null)
		            connect.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(connect!=null)
		            connect.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
	}
	
	public void selectTable()
	{
		Connection connect=Donor.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		try{
			stmt =connect.createStatement();
			String sql="SELECT * FROM DONOR";
			rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				String firstName=rs.getString("fName");
				String lastName=rs.getString("lName");
				int amt=rs.getInt("amount");
				String em=rs.getString("email");
				
				
				System.out.println("First Name: "+firstName);
				System.out.println("Last Name: "+lastName);
				System.out.println("Amount: "+amt);
				System.out.println("Email: "+em);
				System.out.println("\n"+"\n");
			}
			rs.close();
		}catch(SQLException se){
		      se.printStackTrace();
		   }finally{
		      try{
		         if(stmt!=null)
		            connect.close();
		      }catch(SQLException se){
		      }
		      try{
		         if(connect!=null)
		            connect.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		   }
	}
	
	
	
}
