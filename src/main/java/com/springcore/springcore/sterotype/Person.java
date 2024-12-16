package com.springcore.springcore.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//if we dont pass any name it will use camle case name of class name like person
@Component("person1")
public class Person {
	    @Value("arshad")
       private String name;
	    @Value("Delhi")
       private String city;
       
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
       
}
