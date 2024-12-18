package com.springcore.springcore.spel;

import com.springcore.springcore.constuctror_injuction.Addition;

public class Sum {
    private int a;
    private int b;
    
    
      public Sum(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
	}
	public int add() {
    	 return this.a+this.b; 
      }
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
    
}
