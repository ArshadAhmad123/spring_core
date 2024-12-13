package com.springcore.springcore.bean_lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//yaha par hum init and destroy method ko implement karenge from the both interfaces
//aur usme hum object initialization and destruction ke time kuch bhi kaam kara 
//sakte hai
public class Pepsi implements InitializingBean, DisposableBean{
	
    private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	
	//Ye  init method hai jo ke property set hone ke baad call hoga hi hoga
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I am taking pepsi");
		
	}

	//ye destroy method hai jo object ke destruction ke time hi call hoga
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I have finished pepsi");
	}
    
}
