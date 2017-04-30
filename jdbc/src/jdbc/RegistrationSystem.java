package jdbc;

//step 1: importing required packages
import java.sql.*;
import java.util.Scanner;

public class RegistrationSystem {

	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/registration_system";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	public static void main(String args[]) {
		Connection conn=null;
		Statement stmt=null;
		//PreparedStatement pstmt=null;
		
		try{
		//STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);

	      //STEP 4: Execute a query
	      stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT * from student";
	      ResultSet rs = stmt.executeQuery(sql);
	      Scanner sc=new Scanner(System.in);
	         
	         System.out.println("Enter your student id: ");
	         int id=sc.nextInt();
	      
	    //STEP 5: Extract data from result set
	         System.out.println("The Students in Database are...");
	      while(rs.next()){
	         //Retrieve by column name
	         int studentId  = rs.getInt("Student_id");
	         String firstName = rs.getString("First_name");
	         String lastName = rs.getString("Last_name");
	         
	         System.out.println(" "+studentId+" "+firstName+" "+lastName);
	         if(studentId==id)
	         {
	        	 System.out.println("ID: "+id);
	        	 System.out.println("   Name: " +firstName+" "+lastName);
	        	 
	        	 Statement stmt1=null;
	        	 stmt1=conn.createStatement();
	        	 String sql1;
	        	 sql1="SELECT * from course";
	   	      ResultSet rs2=stmt1.executeQuery(sql1);
	   	      
	   	      System.out.println("Available courses are....");
	   	   int n=0;
	   	     
	   	      while(rs2.next()){
	   	    	  
	   	    	  n++;
	   	    	  String designator=rs2.getString("designator");
	   	    	  String coursenumber=rs2.getString("course number");
	   	    	  String title=rs2.getString("title");
	   	    	  int credit=rs2.getInt("credits");
	   	    	  String section_number=rs2.getString("section_number");
	   	    	  
	   	    	  System.out.println(+n+". "+designator+" "+coursenumber+"\tName: "+title+"\tcredits: "+credit+"\tSecion Number: "+section_number);
	   	    	  	   	    	        	  
	   	      }
	   	      
	   	   System.out.println("Enter the course serial number you want to enter...");
	    	  int sno=sc.nextInt();
	   	   if(sno==1)
	    	  {
	    		  System.out.println("You are enrolled to CPS 541...");
	    		
	    		
	    		Statement stmt2=null;
	        	 stmt2=conn.createStatement();
	        	 String sql2;
	        	 sql2 ="SELECT * from section WHERE section_number='2222124'";
		      ResultSet rs1=stmt2.executeQuery(sql2);
		      
		      while(rs1.next()){
		    	  String sectionNumber =rs1.getString("section_number");
		    	  String days=rs1.getString("days");
		    	  String start_time=rs1.getString("start_time");
		    	  String end_time=rs1.getString("end_time");
		    	  int capacity=rs1.getInt("capacity");
		    	  String building_name=rs1.getString("building_name");
		    	  String room_number=rs1.getString("room_number");
		    	  
		    	  System.out.println("Details of the class are.... "+"\n\tSection Number: "+sectionNumber+"\n\tDays: "+days+"\n\tStart time: "+start_time);
		    	  System.out.println("\tEnd Time: "+end_time+"\n\tCapacity: "+capacity+"\n\tBuilding: "+building_name+"\n\tRoom: "+room_number);
		    	  		  
		    	  Statement stmt3=null;
		    	  stmt3=conn.createStatement();
		    	  String sql3;
		    	  sql3="INSERT INTO enroll"+"VALUES('enrolled','drop',?,?)";
		    	  PreparedStatement ps=conn.prepareStatement(sql3);
		    	  ps.setLong(1,studentId);
		    	  ps.setString(2,sectionNumber);
		    	  stmt3.executeUpdate(sql3);
		    	  
		    		  //String enroll="Enrolled";
		    		  //String drop="Drop";
		    		  Statement stmt4=null;
		    		  stmt4=conn.createStatement();
		    		  String sql4="SELECT * FROM enroll";
		    		  ResultSet rs4=stmt4.executeQuery(sql4);
		    		  System.out.println(sql4);
		      }
		      rs1.close();
	    	  }
	    	if(sno==2)
	    	  {
	    		  System.out.println("You were enrolled to CPS 685...");
	    		  
	    		  Statement stmt2=null;
		        	 stmt2=conn.createStatement();
		        	 String sql2;
		        	 sql2 ="SELECT * from section WHERE section_number='2222126'";
			      ResultSet rs1=stmt2.executeQuery(sql2);
			      
			      while(rs1.next()){
			    	  String sectionNumber =rs1.getString("section_number");
			    	  String days=rs1.getString("days");
			    	  String start_time=rs1.getString("start_time");
			    	  String end_time=rs1.getString("end_time");
			    	  int capacity=rs1.getInt("capacity");
			    	  String building_name=rs1.getString("building_name");
			    	  String room_number=rs1.getString("room_number");
			    	  
			    	  System.out.println("Details of the class are.... "+"\n\tSection Number: "+sectionNumber+"\n\tDays: "+days+"\n\tStart time: "+start_time);
			    	  System.out.println("\tEnd Time: "+end_time+"\n\tCapacity: "+capacity+"\n\tBuilding: "+building_name+"\n\tRoom: "+room_number);
			    	  		    	  
			      }
			      rs1.close();
	    	  }
	    	if(sno==3)
	    	  {
	    		  System.out.println("You were enrolled to ITC 510...");
	    		  
	    		  Statement stmt2=null;
		        	 stmt2=conn.createStatement();
		        	 String sql2;
		        	 sql2 ="SELECT * from section WHERE section_number='2222123'";
			      ResultSet rs1=stmt2.executeQuery(sql2);
			      
			      while(rs1.next()){
			    	  String sectionNumber =rs1.getString("section_number");
			    	  String days=rs1.getString("days");
			    	  String start_time=rs1.getString("start_time");
			    	  String end_time=rs1.getString("end_time");
			    	  int capacity=rs1.getInt("capacity");
			    	  String building_name=rs1.getString("building_name");
			    	  String room_number=rs1.getString("room_number");
			    	  
			    	  System.out.println("Details of the class are.... "+"\n\tSection Number: "+sectionNumber+"\n\tDays: "+days+"\n\tStart time: "+start_time);
			    	  System.out.println("\tEnd Time: "+end_time+"\n\tCapacity: "+capacity+"\n\tBuilding: "+building_name+"\n\tRoom: "+room_number);
			    	  	
			    	  
			      }
			      rs1.close();
	    	  }
	    	if(sno==4)
	    	  {
	    		  System.out.println("You were enrolled to ITC 520...");
	    		  
	    		  Statement stmt2=null;
		        	 stmt2=conn.createStatement();
		        	 String sql2;
		        	 sql2 ="SELECT * from section WHERE section_number='2222125'";
			      ResultSet rs1=stmt2.executeQuery(sql2);
			      
			      while(rs1.next()){
			    	  String sectionNumber =rs1.getString("section_number");
			    	  String days=rs1.getString("days");
			    	  String start_time=rs1.getString("start_time");
			    	  String end_time=rs1.getString("end_time");
			    	  int capacity=rs1.getInt("capacity");
			    	  String building_name=rs1.getString("building_name");
			    	  String room_number=rs1.getString("room_number");
			    	  
			    	  System.out.println("Details of the class are.... "+"\n\tSection Number: "+sectionNumber+"\n\tDays: "+days+"\n\tStart time: "+start_time);
			    	  System.out.println("\tEnd Time: "+end_time+"\n\tCapacity: "+capacity+"\n\tBuilding: "+building_name+"\n\tRoom: "+room_number);
			    	  		    	  
			      }
			      rs1.close();
	    	  }
	    	if(sno==5)
	    	  {
	    		  System.out.println("You were enrolled to ITC 630...");
	    		  
	    		  Statement stmt2=null;
		        	 stmt2=conn.createStatement();
		        	 String sql2;
		        	 sql2 ="SELECT * from section WHERE section_number='2222127'";
			      ResultSet rs1=stmt2.executeQuery(sql2);
			      
			      while(rs1.next()){
			    	  String sectionNumber =rs1.getString("section_number");
			    	  String days=rs1.getString("days");
			    	  String start_time=rs1.getString("start_time");
			    	  String end_time=rs1.getString("end_time");
			    	  int capacity=rs1.getInt("capacity");
			    	  String building_name=rs1.getString("building_name");
			    	  String room_number=rs1.getString("room_number");
			    	  
			    	  System.out.println("Details of the class are.... "+"\n\tSection Number: "+sectionNumber+"\n\tDays: "+days+"\n\tStart time: "+start_time);
			    	  System.out.println("\tEnd Time: "+end_time+"\n\tCapacity: "+capacity+"\n\tBuilding: "+building_name+"\n\tRoom: "+room_number);
			    	  		    	  
			      }
			      rs1.close();
	    	  }
	   	      
	   	   rs2.close();
	         }
	         	         
	      }
	        
	       	      
	      	      
	      //STEP 6: Clean-up environment
	      
	      rs.close();
	      stmt.close();
	      conn.close();
	}catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
		   
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("\nGoodbye!");
	}//end main
	}//end FirstExample
