package com.springcore.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo1")
public class Demo {
	
	     @Value("#{(6+3)*2+10}")
      	 private int x;
	     
	     public double getD() {
			return d;
		 }
	     
		 public void setD(double d) {
			this.d = d;
		 }
		 
		 @Value("#{20}")
      	 private int y;
		 
		 //here I am calling static method with fully qualified name
		 //like this T(fully qualified name of class).methodName
      	 @Value("#{ T(java.lang.Math).sqrt(2)}")
	     private double d;
      	 
      	 @Value("#{ new com.springcore.springcore.spel.Sum(4,5).add() }")
      	 private int z;
      	 
      	 //yaha tum ("8>9") jo bhi boolean value return kare uska use kar sakte hai
      	 @Value("true")
      	 private boolean isActive;
      	 
      	 public int getZ() {
			return z;
		}

		public void setZ(int z) {
			this.z = z;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

		public String getName() {
			 return name;
		 }
		public void setName(String name) {
			this.name = name;
		}
		

		//here I am creating String obj and parsing string value
      	 @Value("#{new java.lang.String('Arshad Ahmad')}")
      	 private String name;
      	 
      	 public int add() {
      		 return this.x+this.y;
      	 }
      	 
		public int getX() {
			return x;
		}
		
		
		@Override
		public String toString() {
			return "Demo [x=" + x + ", y=" + y + ", d=" + d + ", z=" + z + ", isActive=" + isActive + ", name=" + name
					+ "]";
		}

		public void setX(int x) {
			this.x = x;
			System.out.println("here1");
		}
		
		public int getY() {
			return y;
		}
		
		public void setY(int y) {
			this.y = y;
			System.out.println("here2");
		}
      	 
}
