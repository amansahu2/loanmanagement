package com.loan.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class User {

	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "password",nullable = false)
	private String password;
	
	@Column(name="admin")
	private boolean admin;

	public User() {
		super();
	}

	public User(String username, String password, boolean admin) {
		super();
		this.username = username;
		this.password = password;
		this.admin = admin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
