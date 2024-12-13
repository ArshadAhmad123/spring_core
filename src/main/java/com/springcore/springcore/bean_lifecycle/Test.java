package com.springcore.springcore.bean_lifecycle;

import org.springframework.beans.factory.parsing.PassThroughSourceExtractor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
//this is the heirarchy	
//	ApplicationContext (Interface)
//	|
//	|-- ConfigurableApplicationContext (Interface)
//	|
//	|-- AbstractApplicationContext (Abstract Class)
//	|
//	|-- ClassPathXmlApplicationContext (Class)
//	|
//	|-- FileSystemXmlApplicationContext (Class)
//	|
//	|-- AnnotationConfigApplicationContext (Class)
//	|
//	|-- GenericApplicationContext (Class)
//	|
//	|-- StaticApplicationContext (Class)

	public static void main(String[] args) {
	//	ApplicationContext ke pass shoutdown hook method nahi hai ye iski child class ke 
	//	Pass hai
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("com/springcore/springcore/bean_lifecycle/lifecycle_config.xml");
		context.registerShutdownHook();
		Samosa samosa= (Samosa)context.getBean("user1");
        System.out.println(samosa);
        Pepsi pepsi = (Pepsi)context.getBean("user2");
        System.out.println(pepsi);
	}

}
