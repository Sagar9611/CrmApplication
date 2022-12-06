package com.zoho.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Billing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Invoice_number")
private long invoiceNumber;
	@Column(name="name" ,nullable=false)
private String name;
	@Column(name="email" ,nullable=false,unique=true)
private String email;
private long mobile;
private String product;
private int amount;
public long getInvoiceNumber() {
	return invoiceNumber;
}
public void setInvoiceNumber(long invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

}
