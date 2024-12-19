package com.springcore.springcore.remove_xml;

import org.springframework.beans.factory.annotation.Value;

public class Samosa {
	
	@Value("5")
	private int a;
	
	@Override
	public String toString() {
		return "Samosa [a=" + a + "]";
	}

	
	 
  public void display() {
	  System.out.println("I am eating samosa");
  }
}
