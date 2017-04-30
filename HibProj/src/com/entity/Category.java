package com.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

	@Id
	@Column(name="category_id")
	private int category_id;
	@Column(name="category_name")
	private String category_name;
	
	@ManyToMany
	@JoinTable(name="category_item", joinColumns={@JoinColumn(name="category_id")},inverseJoinColumns={@JoinColumn(name="item_id")})
	private Set<Item> items;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(int category_id, String category_name) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
	}

	
	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	
}
