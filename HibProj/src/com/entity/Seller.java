package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@DiscriminatorValue("seller")
public class Seller extends User{

	@Column(name="firm_name")
	private String firmName;
	
	private Set<Item> items = new HashSet<Item>();
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Seller(int userId, String firstName, String lastname, int phoneNumber, Address address, String firmName) {
		super(userId, firstName, lastname, phoneNumber, address);
		this.firmName = firmName;
	}


	@OneToMany()
	@JoinColumn(name="user_id")
	public Set<Item> getItems() {
		return items;
	}



	public void setItems(Set<Item> items) {
		this.items = items;
	}



	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	
	
}
