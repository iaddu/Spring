package com.springcore.init_destroy;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price using set()");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa price=" + price;
	}
	
	public void init() {
		System.out.println("initializing init");
	}
	public void destroy() {
		System.out.println("destroying");
	}
}
