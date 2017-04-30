package com.banking;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Orders")
public class Orders {
	@Id
	int ord_no;
	float purch_amt;
	Date ord_date;
	int customer_id;
	int salesman_id;
	public Orders() {
		super();
	}
	public Orders(int ord_no, float purch_amt, Date ord_date, int customer_id, int salesman_id) {
		super();
		this.ord_no = ord_no;
		this.purch_amt = purch_amt;
		this.ord_date = ord_date;
		this.customer_id = customer_id;
		this.salesman_id = salesman_id;
	}
	public int getOrd_no() {
		return ord_no;
	}
	public void setOrd_no(int ord_no) {
		this.ord_no = ord_no;
	}
	public float getPurch_amt() {
		return purch_amt;
	}
	public void setPurch_amt(float purch_amt) {
		this.purch_amt = purch_amt;
	}
	public Date getOrd_date() {
		return ord_date;
	}
	public void setOrd_date(Date ord_date) {
		this.ord_date = ord_date;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	
}
