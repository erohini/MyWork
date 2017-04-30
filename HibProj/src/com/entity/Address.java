package com.entity;

import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {

	@Id
	@Column(name="address_id")
	private int address_id;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	
//	@OneToOne(mappedBy="address")
//	Customer customer;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int address_id, String city, String state) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.state = state;
	}

	
	
//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
