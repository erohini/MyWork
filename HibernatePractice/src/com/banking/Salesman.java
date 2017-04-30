package com.banking;

public class Salesman {

	int salesman_id;
	String name;
	String city;
	float commission;
	public Salesman() {
		super();
	}
	public Salesman(int salesman_id, String name, String city, float commission) {
		super();
		this.salesman_id = salesman_id;
		this.name = name;
		this.city = city;
		this.commission = commission;
	}
	public int getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	
}
