package com.springcore.springcore.remove_xml;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
	   
	   //agar context resource leak ho raha hai toh closa karne ke liye ApplicationContext ki jagah
	   //ClassPathXmlApplicationContext use kar sakte hai kyon ki iske pass hi close method hai
	   
	   AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
       Person person=context.getBean("person1",Person.class);
       System.out.println(person);
       Samosa samosa=context.getBean("samosa2",Samosa.class);
       System.out.println(samosa);
       samosa.display();
       Student student=context.getBean("getStudent",Student.class);
       System.out.println(student);
       student.print();
       
       //yaha par resource close kiya 
       context.close();
       
   }
}
