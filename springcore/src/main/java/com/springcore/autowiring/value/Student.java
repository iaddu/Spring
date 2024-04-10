package com.springcore.autowiring.value;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("std1")
public class Student {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phones=" + phones + "]";
	}
	@Value("1")
	private int id;
	@Value("Alpha")
	private String name;
	
	private List<String>phones;
	
}
