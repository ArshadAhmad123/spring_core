package com.springcore.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		 ApplicationContext contxt = new ClassPathXmlApplicationContext("com/springcore/springcore/standalone/collections/aloneconfig.xml");
         Person p = (Person)contxt.getBean("person1");
         System.out.println(p);	
         
         Person p1 = contxt.getBean("person2",Person.class);
         System.out.println(p1);
         
	}
  
}
