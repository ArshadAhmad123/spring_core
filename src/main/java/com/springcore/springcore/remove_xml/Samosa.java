package com.springcore.springcore.remove_xml;

import org.springframework.beans.factory.annotation.Value;

public class Samosa {
	@Override
	public String toString() {
		return "Samosa [a=" + a + "]";
	}

	@Value("5")
	private int a;
	 
  public void display() {
	  System.out.println("I am eating samosa");
  }
}
