package com.springcore;

import java.util.List;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private List<String> studentPhones;
	public List<String> getStudentPhones() {
		return studentPhones;
	}
	public void setStudentPhones(List<String> studentPhones) {
		this.studentPhones = studentPhones;
	}
	public int getstudentId() {
		return studentId;
	}
	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getstudentAddress() {
		return studentAddress;
	}
	public void setstudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentPhones=" + studentPhones + "]";
	} 
	
	 
	

}
