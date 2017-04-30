package com.business;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("Meluha");
		bookList.add("Secret of Nagas");
		bookList.add("Vayuputras");
		
		musicList.add("Kiravani");
		musicList.add("Ilayaraja");
		musicList.add("AR Rehman");
		
		movieList.add("Vedam");
		movieList.add("Pilla zamindar");
		movieList.add("a aa");
	}
	
	public List<String> getProductCategories(){
	List<String> categories = new ArrayList<>();
	categories.add("Books");
	categories.add("Music");
	categories.add("Movies");
	return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
			return null;
	}
	
	public boolean addProduct(String category, String Product){
		switch(category.toLowerCase()){
		case "books":
			return bookList.add(Product);
		case "music":
			return musicList.add(Product);
		case "movies":
			return movieList.add(Product);
		default:
			return false;
	}
		
	}
	
	public List<Product> getProductsv2(Product category){
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Secret","1234",34));
		return productList;
	}
}
