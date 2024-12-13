package com.springcore.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springcore.annotation.Example;

public class Test {
    public static void main(String args[]) {
    	 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore/autowiring/annotation/auto.xml");
         Emp emp =  (Emp)context.getBean("std2");
         System.out.println(emp);
    }
}
