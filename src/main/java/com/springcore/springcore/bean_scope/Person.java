package com.springcore.springcore.bean_scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//if we dont pass any name it will use camle case name of class name like person
@Component("person1")
@Scope("prototype")
public class Person {
	    @Value("arshad")
       private String name;
	    @Value("Delhi")
       private String city;
	    @Value("#{tempList}")
       private List<String> phone;
       
	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
       
}
