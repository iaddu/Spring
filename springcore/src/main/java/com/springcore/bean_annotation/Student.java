package com.springcore.bean_annotation;

import org.springframework.stereotype.Component;


public class Student {
	
	
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		return "i am a student"+samosa;
	}
	
}
