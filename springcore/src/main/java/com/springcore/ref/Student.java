package com.springcore.ref;

public class Student {
	private int studentId;
	private String studentName;
	private Address studentAddress;
	public int getStudentId() {
	
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Guten Morgen,Ich bin "+studentName+
				"\nMein Id ist "+studentId+
				"\nIch wohne in "+studentAddress;
	}
	

}
