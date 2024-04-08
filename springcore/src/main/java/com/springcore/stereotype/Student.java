package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Alpah")
	private String name;

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	

}
