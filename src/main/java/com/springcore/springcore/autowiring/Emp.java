package com.springcore.springcore.autowiring;

public class Emp {
   private Address adress;

@Override
public String toString() {
	return "Emp [adress=" + adress + "]";
}

public Address getAdress() {
	return adress;
}

public void setAdress(Address adress) {
	this.adress = adress;
	System.out.println("inside setter method");
}

public Emp(Address adress) {
	super();
	this.adress = adress;
	System.out.println("inside constructor");
}


public Emp() {
	super();
	// TODO Auto-generated constructor stub
}


   
}
