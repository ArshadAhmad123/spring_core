package com.springcore.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore/sterotype/st_config.xml");
       Person person=context.getBean("person1",Person.class);
       System.out.println(person);
   }
}
