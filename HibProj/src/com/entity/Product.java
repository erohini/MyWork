package com.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {
	
@Id
@Column(name="PRODUCT_ID")
private int id;
@Column(name="PRODUCT_NAME")
private String name;
@Column(name="PRODUCT_PRICE")
private float price;
@Column(name="PRODUCT_DESCRIPTION")
private String description;



public Product() {
	// TODO Auto-generated constructor stub
}

@ManyToOne
@JoinColumn(name="supplier_id")
private Supplier supplier;

public Product(int id, String name, float price, String description) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.description = description;
}



public Supplier getSupplier() {
	return supplier;
}



public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}



}
