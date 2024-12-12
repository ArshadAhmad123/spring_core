package com.springcore.springcore.bean_lifecycle;

public class Samosa {
     private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	//init:-- iska naam kuch bhi xyz rakh sakte hai aur ye method obj initialization ke time 
	//call hoga.. Lekin ye name aur xml init-method ka naam match karna chahiye
    public void init() {
    	System.out.println("Inside init method");	 
    }
    
 //destroy:-- iska naam kuch bhi xyz rakh sakte hai aur ye method obj destroy ke time 
 //call hoga.. Lekin ye name aur xml destroy-method ka naam match karna chahiye 
    
 //ye method call nahi hoga jab tak tum shutdown hook method declare nahi karte
    public void destroy() {
        System.out.println("Inside destroy method");	 
    }
}
