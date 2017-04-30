package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Test {
public void addProduce(int id, String name, float price, String description){
	//public static void main(String[] args) {
		try{
		// Step 1: Load Drivers
		Class.forName("org.gjt.mm.mysql.Driver");
		
		// Step 2: Establish connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		// Step 3: Construct a query
		String query = "insert into test.product(product_id, produce_name, produce_price, product_description)"
				+ "values(?,?,?,?)";
		
		// Step 4: Create a statement object
		//Statement statement = conn.createStatement();
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setFloat(3, price);
		ps.setString(4, description);
		
		//Step 5: Execute query using statement object
		//int i = statement.executeUpdate(query);
		int i = ps.executeUpdate();
		// for reading records like select
		//ResultSet resultSet = statement.executeQuery(query);
		
//		while(resultSet.next()){
//			System.out.println("Id: "+resultset.getInt("produce_id"));
		// product_id is a database column which is written into Id.
//		}
		
		if(i == 1){
			System.out.println("Record successfully updated...");
		}
		conn.close();
		}catch(Exception e){
			
		}
		

	}

}
