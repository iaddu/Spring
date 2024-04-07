package com.springcore.di_using_constructor;

public class Address {
	private int houseno;
	private String street;
	private String city;
	public Address(int houseno, String street, String city) {
		super();
		this.houseno = houseno;
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", street=" + street + ", city=" + city + "]";
	}
	
	
}
