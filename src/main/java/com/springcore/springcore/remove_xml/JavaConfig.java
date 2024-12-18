package com.springcore.springcore.remove_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.springcore.remove_xml")
public class JavaConfig {
    
	@Bean(name= {"samosa","samosa1","samosa2","samosa3"})
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	
	
	//here I am removing extra annotation lika Component And ComponentScan
	//ComponentScan ye sirf Person ke liye lagaya hua hai
	 @Bean
	 public Student getStudent() {
		 return new Student(getSamosa());
	 }
}