package com.springcore.springcore;


public class Student {
   private int stdId;
   private String stdName;
   private String stdAdress;
public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	System.out.println("i am here");
	this.stdId = stdId;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
public String getStdAdress() {
	return stdAdress;
}
public void setStdAdress(String stdAdress) {
	this.stdAdress = stdAdress;
}
public Student(int stdId, String stdName, String stdAdress) {
	super();
	this.stdId = stdId;
	this.stdName = stdName;
	this.stdAdress = stdAdress;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAdress=" + stdAdress + "]";
}
   
}
