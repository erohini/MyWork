import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.ProductDAO;
import com.vo.Product;



public class Test {
	


	public static ArrayList<Product> getProducts(){
		ArrayList<Product> productList = new ArrayList<Product>();
//		 TODO Auto-generated method stub
				try{
					//load Drivers
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					// Establish Connection
					Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/pdborcl","hr","hr");
					

					String query ="select * from products";
					
					Statement statement = connection.createStatement();
					
					ResultSet resultset =statement.executeQuery(query);
					while(resultset.next())    
					{
						Product product = new Product();
						product.setId(resultset.getInt("product_id"));
						product.setName(resultset.getString("product_name"));
						product.setPrice(resultset.getFloat("product_price"));
						product.setDescription(resultset.getString("product_description"));
						productList.add(product);
					}
					resultset.close();
					connection.close();
					}
		catch(Exception e){
			}
				return productList;
	}
	
//public void removeProduct(){
//	
//		
//	}
	public static void addProducts(Product product){
		try{
			//load Drivers
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			// Establish Connection
			Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/pdborcl","hr","hr");
			
			
			String query ="insert into products(product_id,product_name,product_price,product_description)"
			+ "values(?,?,?,?)";
			
			

//			String query ="create table abc"+
//			"(product_id number(6),product_name char(20),product_price float(20),product_description char(30))";
					
			PreparedStatement preparedstatement  =connection.prepareStatement(query);

			preparedstatement.setInt(1, product.getId());
			preparedstatement.setString(2,product.getName());
			preparedstatement.setFloat(3, product.getPrice());
			preparedstatement.setString(4, product.getDescription());
			
			preparedstatement.executeUpdate();
			
			
//			System.out.println("created table");
			
		System.out.println("record added");
		
		connection.close();
			}catch(Exception e)
		{				
			}
	}
	
		
	public static void main(String[] args) {
		
		
		ProductDAO productDAO = new ProductDAO();
//		
//		productDAO.deleteProduct(109);
//	List<Product> products = productDAO.getProduct();
	
//	productDAO.getProductById(101);
	
		
		
//	Product products = new Product(109,"Secret Hero",3400,"Book");
//	
//	productDAO.updateProduct(products);
//		Product products = productDAO.getProductById(101);
	
		Product product= new Product(108,"Secret",3400,"Book");
		
		addProducts(product);
		
//		ArrayList<Product> products = getProducts();
//		
//		for (Product product : products) 
//		{
//			System.out.println("Product_id :" +product.getId());
//			System.out.println("Product_name :" +product.getName());
//			System.out.println("Product_price :" +product.getPrice());
//			System.out.println("Product_Description:" +product.getDescription());
//			System.out.println();
//			
//		}
		
		
		
		
	}	
}

