package com;

public class Item {
	private int id;
	private String name;
	private float price;
	
	private Bid[] bids;
	
	public Item(){
		
	}
	
	public Item(int id, String name, float price){
		this.id = id;
		this.name =name;
		this.price = price;
		
	}
	
	public Bid[] getBids() {
		return bids;
	}

	public void setBids(Bid[] bids) {
		this.bids = bids;
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
	
	
}
