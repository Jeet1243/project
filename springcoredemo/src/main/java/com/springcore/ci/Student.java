package com.springcore.ci;

public class Student {
	private String studentName;
	private Address address;
	
	public Student(String studentName, Address address) {
		super();
		this.studentName = studentName;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", address=" + address + "]";
	}
	
	
	
	
}
