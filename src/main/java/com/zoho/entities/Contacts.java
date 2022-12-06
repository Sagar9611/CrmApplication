package com.zoho.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contacts")
public class Contacts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	@Column(name="Name",length=30,nullable=false)
private String name;
	@Column(name="Email",nullable=false,unique=true)
private String email;
	
private long mobile;

private String source;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
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

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

}
