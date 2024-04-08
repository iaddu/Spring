package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String name;
	private int id;
	@Autowired
	@Qualifier("add1")
	private Address address;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emloyee [name=" + name + ", id=" + id + "]"+"address= "+address;
	}
	
}
