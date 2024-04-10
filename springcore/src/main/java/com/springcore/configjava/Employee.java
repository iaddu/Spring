package com.springcore.configjava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp1")

public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	@Value("hong yun")
	private String name;
	@Value("2")
	private int id;
}
