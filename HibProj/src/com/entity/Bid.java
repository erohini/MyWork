package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BID")
public class Bid {

	@Id
	@Column(name="bid_id")
	private int id;
	@Column(name="bid_price")
	private float bidAmount;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bid_item_id")
	private Item item;
	
	
	public Bid() {
		// TODO Auto-generated constructor stub
	}

	public Bid(int id, float bidAmount) {
		super();
		this.id = id;
		this.bidAmount = bidAmount;
	}
	
	

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(float bidAmount) {
		this.bidAmount = bidAmount;
	}
	
	
}
