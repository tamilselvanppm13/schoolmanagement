package com.example.demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Schoolentity {
@Id
	private int id;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Schoolentity(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Schoolentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
