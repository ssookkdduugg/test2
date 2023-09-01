package com.test02;

public class Student extends Human {
	String number;
	String major; 
	
	Student(){}
	Student(String name, int age, int height, int weight, String number,String major){
		super(name,age,height,weight);
		this.number = number;
		this.major = major;
		
	}
	
	@Override
	public String toString() {
		return super.toString()+ number+"\t"+ major;
	}
}
