package com.entity;

import javax.persistence.*;

@Entity
@Table(name="euser")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type",discriminatorType=DiscriminatorType.STRING)
public abstract class User {

	@Id
	@Column(name="user_id")
	private int userId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_Name")
	private String lastname;
	@Column(name="phone_number")
	private int phoneNumber;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	

	public User(int userId, String firstName, String lastname, int phoneNumber, Address address) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
