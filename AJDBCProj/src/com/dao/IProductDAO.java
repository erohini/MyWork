package com.dao;

import java.util.List;

import com.vo.Product;

public interface IProductDAO {

	public void addProduct(Product product);
	
	public Product getProductById(int id);
	
	public List<Product> getProduct();
	
	public void updateProduct(Product product);
	
	public void deleteProduct(int id);
}
