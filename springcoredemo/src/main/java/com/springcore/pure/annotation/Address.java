package com.springcore.pure.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("Maharashtra")
	private String state;
	
	@Value("Mumbai")
	private String city;
	
	@Value("120021")
	private int pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
