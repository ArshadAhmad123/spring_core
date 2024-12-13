package com.springcore.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String args[]) {
	
	   AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore/annotation/anno_config.xml");
           Example example =  (Example)context.getBean("student1");
           context.registerShutdownHook();//iske bina toh destroy method kabhi kaam nahi kareg.aur ye sirf AbstractApplicationContext me hi milega  
           System.out.println(example);
  
  }
}
