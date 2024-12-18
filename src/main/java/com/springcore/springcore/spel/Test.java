package com.springcore.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//here we are learing spel 

public class Test {
	public static void main(String[] args) {
		   ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/spel/config.xml");
          
           Demo d2 = context.getBean("demo1",Demo.class);
           System.out.println(d2.add());
           System.out.println(d2);
	}
}
