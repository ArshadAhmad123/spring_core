package com.springcore.springcore.constuctror_injuction;

public class Person {
private String name;
private int personId;
private Address adress;
public Person(String name, int personId, Address adress) {
	super();
	this.name = name;
	this.personId = personId;
	this.adress = adress;
}

@Override
public String toString() {
	return "Person [name=" + name + ", personId=" + personId + ", adress=" + adress + "]";
}

}
