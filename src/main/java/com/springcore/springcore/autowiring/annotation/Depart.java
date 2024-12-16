package com.springcore.springcore.autowiring.annotation;

public class Depart {
	
     private String section;

	public String getSection() {
		return section;
	}
    
	@Override
	public String toString() {
		return "Depart [section=" + section + "]";
	}

	public void setSection(String section) {
		this.section = section;
		System.out.println("inside Depart setter injection");
	}

	public Depart(String section) {
		super();
		this.section = section;
	}

	public Depart() {
		super();
	}
}
