package com.banking;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Cust_Table")
public class Customer {
	@Id
	@Column(name="cust_id")@GeneratedValue(strategy= GenerationType.AUTO)
	int customer_ID;
	@Column(name="cust_name")
	String customer_Name;
	@Column(name="cust_city")
	String city;
	@OneToMany
	@JoinColumn(name="customer_id")
	private Set<Orders> orders;
	public Customer() {
		super();
	}
	public Customer(int customer_ID, String customer_Name, String city) {
		super();
		this.customer_ID = customer_ID;
		this.customer_Name = customer_Name;
		this.city = city;
	}
	public int getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Set<Orders> getOrders() {
		return orders;
	}
	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	
	
	
}
