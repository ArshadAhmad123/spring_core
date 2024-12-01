package com.springcore.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore/reference/ref.xml");
	   
       A objA=(A)context.getBean("objA");
	   System.out.println(objA);
	   
	   B objB=(B)context.getBean("objB");
	   System.out.println(objB);
	}

}
