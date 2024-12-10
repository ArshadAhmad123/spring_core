package com.springcore.springcore.constuctror_injuction;

public class Addition {
      int a;
      int b;
    
     
      public Addition(int a, int b) {
    		super();
    		this.a = a;
    		this.b = b;
    		System.out.println("this is int constructor");
    	}
     public Addition(double a, double b) {
    		super();
    		this.a = (int)a;
    		this.b = (int)b;
    		System.out.println("This is double constructor");
    }
      
                
	public Addition(int b, String a) {
		super();
		this.b = (int)b;
		this.a = Integer.parseInt(a);
		System.out.println("This is int, String constructor");
	}     
	
	public Addition(String b, String a) {
		super();
		this.b = Integer.parseInt(b);
		this.a = Integer.parseInt(a);
		System.out.println("This is String, String constructor");
	}     
    
	public void sum() {
		System.out.println("sum ="+(this.a+this.b));
	}
}
