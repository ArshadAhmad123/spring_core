package com.springcore.springcore.remove_xml;


//ye class without @component and @ComponentScan ke bina kaam karegi
//kyon hum yaha bean annotation use kar rahe hai javaconfig class mein
public class Student {
	
    private Samosa samosa;
    
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void print() {
		this.samosa.display();
		System.out.println("I am studing");
	}
}
