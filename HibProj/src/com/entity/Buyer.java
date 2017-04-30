package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="buyer")
public class Buyer extends User{

	@Column(name="fCategory")
	private String favouriteCategory;
	
	private Set<Bid> bids = new HashSet<Bid>();
	
	public Buyer(){
		
	}
	
	
	public Buyer(int userId, String firstName, String lastname, int phoneNumber, Address address,
			String favouriteCategory) {
		super(userId, firstName, lastname, phoneNumber, address);
		this.favouriteCategory = favouriteCategory;
	}


	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	public Set<Bid> getBids() {
		return bids;
	}



	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

	public String getFavouriteCategory() {
		return favouriteCategory;
	}

	public void setFavouriteCategory(String favouriteCategory) {
		this.favouriteCategory = favouriteCategory;
	}
	
	
}
