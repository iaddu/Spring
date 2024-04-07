package com.springcore.di_using_constructor;

public class Student {
	private int studentId;
	private String studentName;
	private Address studentAddress;
	public Student(int studentId, String studentName, Address studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
}
