package com.springcore.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("address2")
    private Address address;
	
	@Autowired
	@Qualifier("depart2")
    private Depart depart;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", depart=" + depart + "]";
	}

	public Depart getDepart() {
		return depart;
	}

	public Emp(Address address, Depart depart) {
		super();
		this.address = address;
		this.depart = depart;
	}

	public void setDepart(Depart depart) {
		this.depart = depart;
	}

	

 
   
}
