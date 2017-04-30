package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vo.Product;

public class ProductDAO extends BaseDAO implements IProductDAO {

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		Connection connection = getconnection();
		
		
		try{
		String query ="insert into products(product_id,product_name,product_price,product_description)"
				+ "values(?,?,?,?)";
				
				

//				String query ="create table abc"+
//				"(product_id number(6),product_name char(20),product_price float(20),product_description char(30))";
						
				PreparedStatement preparedstatement  =connection.prepareStatement(query);

				preparedstatement.setInt(1, product.getId());
				preparedstatement.setString(2,product.getName());
				preparedstatement.setFloat(3, product.getPrice());
				preparedstatement.setString(4, product.getDescription());
				
				preparedstatement.executeUpdate();
				
				
//				System.out.println("created table");
				
			System.out.println("record added");
			
			connection.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}

	@Override
	public Product getProductById(int id) {
		ArrayList<Product> productList = new ArrayList<Product>();
//		 TODO Auto-generated method stub
		
		Product product = null;
				try{
					
					
					Connection connection = getconnection();

					String query ="select * from products"+ "where product_id =?";
				
					PreparedStatement statement = connection.prepareStatement(query);
					
					statement.setInt(1, id);
					ResultSet resultset =statement.executeQuery();
					if(resultset.next())    
					{
						product = new Product();
//						product.setId(resultset.getInt("product_id"));
//						product.setName(resultset.getString("product_name"));
//						product.setPrice(resultset.getFloat("product_price"));
//						product.setDescription(resultset.getString("product_description"));
//						productList.add(product);
						
						
					}
					
					System.out.println("id "+product.getId());
					System.out.println("name "+product.getName());
					System.out.println("price "+product.getPrice());
					System.out.println("description "+product.getDescription());
					resultset.close();
					connection.close();
					}
		catch(Exception e){
			}
		return product;
	}

	@Override
	public List<Product> getProduct() {
		ArrayList<Product> productList = new ArrayList<Product>();
//		 TODO Auto-generated method stub
				try{
					Connection connection = getconnection();

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
	

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
		try{
			Connection connection = getconnection();
			
			String query = "update  products"
			+" set product_id=?, product_name=?,product_price=?,product_description=? where product_id = ?  ";
			
			PreparedStatement stmt = connection.prepareStatement(query);
			
			
			
		stmt.setInt(1, product.getId());
		stmt.setString(2,product.getName());
		stmt.setString(4, product.getDescription());
		stmt.setFloat(3, product.getPrice());
		stmt.setInt(5, 108);
//		stmt.setString(6, "secrto");
//		stmt.setFloat(7, 340);
//		stmt.setString(8, "spring");
		stmt.executeUpdate();
			
		
				System.out.println("Record Updated");
				
			
			connection.close();
		}catch(Exception e)
		{
			
		}
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Connection connection = getconnection();
	try{
		String query ="Delete from products"+
	" where product_id=?";
		PreparedStatement stmnt = connection.prepareStatement(query);
		
		stmnt.setInt(1, id);
		stmnt.executeUpdate();
		
		System.out.println("Record deleted");
		
		connection.close();
	}
	catch(Exception e)
	{
		
	}
	}

}
