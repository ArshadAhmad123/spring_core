package com.springcore.springcore.remove_xml;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//agar component use karna hai toh class ko configuration and component annotation deni hogi                          
//@Component
//@Configuration
//@ComponentScan(basePackages="com.springcore.springcore.remove_xml")





//if we dont pass any name it will use camle case name of class name like person
@Component("person1")
public class Person {
	    @Value("arfat")
       private String name;
	    
	    @Value("Delhi 56")
       private String city;
	    
       
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city +  "]";
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
       
}
