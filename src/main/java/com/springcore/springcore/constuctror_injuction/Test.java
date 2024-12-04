package com.springcore.springcore.constuctror_injuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore/constuctror_injuction/constructor_config.xml");
	     Person p = (Person)context.getBean("person1");
	     System.out.println(p);
	     Person p1 = (Person)context.getBean("person2");
	     System.out.println(p1);
	}

}
