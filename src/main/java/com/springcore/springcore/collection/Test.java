package com.springcore.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore/collection/Collection_config.xml");
        Emp emp1=(Emp)context.getBean("Emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAdresses());
        System.out.println(emp1.getCourses());
	}

}
