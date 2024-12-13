package com.springcore.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

   private Address address;
   private Depart depart;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Depart getDepart() {
	return depart;
}


//here we can also use autowired .. ye setter property se inject karega 

public void setDepart(Depart depart) {
	this.depart = depart;
	System.out.println("inside Emp setter");
}
@Autowired
public Emp(Address address, Depart depart) {
	super();
	this.address = address;
	this.depart = depart;
	System.out.println("inside Emp constructor.....");
}
@Override
public String toString() {
	return "Emp [address=" + address + ", depart=" + depart + "]";
}

   
}
