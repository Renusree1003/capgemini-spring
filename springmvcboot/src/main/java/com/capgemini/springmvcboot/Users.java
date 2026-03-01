package com.capgemini.springmvcboot;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;

@Entity
public class Users {
	private String name;
	@Id
	private String email;
	private String number;
	private String password;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", email=" + email + ", number=" + number + ", password=" + password + "]";
	}
	
	
	
	

}
