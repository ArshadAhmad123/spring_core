package com.springcore.springcore.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//bean scope
//Singleton
//prototype
//request
//session
//globelsession
public class Test {
   public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore/bean_scope/scope.xml");
       Person person=context.getBean("person1",Person.class);
       System.out.println(person.hashCode());
       Person person1=context.getBean("person1",Person.class);
       //here you would see both the obj is same means by default it create singleton obj
       System.out.println(person1.hashCode());
      
       
       //to make class prototype we can use this
       // <bean class="" scope="prototype">
       //or we can use annotation
       //@scope("prototype") class name ke ooper
       
       
       Teacher t1 = context.getBean("teacher",Teacher.class);
       System.out.println(t1.hashCode());
       Teacher t2 = context.getBean("teacher",Teacher.class);
       System.out.println(t2.hashCode());
   }
}
