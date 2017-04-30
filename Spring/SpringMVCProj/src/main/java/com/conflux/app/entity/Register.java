package com.conflux.app.entity;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Register {
	
	@NotEmpty(message="Username cannot be blank")
	private String userName;
	@Length(min=3,max=20,message="Name should be minimum of 3 and maximum of 20")
	private String firstName;
	private String lastName;
	@NotEmpty(message="email cannot be blank")
	@Email(message="Not valid email address")
	private String email;
	private String city;
	private String state;
	@Pattern(regexp="[0-9]+",message="please provide valid zip")
	private String zip;
	
	public Register() {
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}

}
