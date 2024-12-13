package com.springcore.springcore.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
     private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
     @Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
     
    @PostConstruct 
    public void start() {
    	System.out.println("starting project"); 
    }
    @PreDestroy
    public void end() {
    	System.out.println("ending project");
    }
}
