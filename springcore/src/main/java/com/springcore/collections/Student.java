package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	 private List<String> studentPhones;
	 private Set<String> studentAddresses;
	 private Map<String,String>studentCourses;
	public List<String> getStudentPhones() {
		return studentPhones;
	}
	public void setStudentPhones(List<String> studentPhones) {
		this.studentPhones = studentPhones;
	}
	public Set<String> getStudentAddresses() {
		return studentAddresses;
	}
	public void setStudentAddresses(Set<String> studentAddresses) {
		this.studentAddresses = studentAddresses;
	}
	public Map<String, String> getStudentCourses() {
		return studentCourses;
	}
	public void setStudentCourses(Map<String, String> studentCourses) {
		this.studentCourses = studentCourses;
	}
	@Override
	public String toString() {
		return "Student [studentPhones=" + studentPhones + ", studentAddresses=" + studentAddresses
				+ ", studentCourses=" + studentCourses + "]";
	}
	 

}
