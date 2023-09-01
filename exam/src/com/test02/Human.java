package com.test02;

public class Human {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	public Human() {}


	@Override
	public String toString() {
		return name+"\t"+age+"\t"+height+"\t"+weight+"\t" ;
	}
	
	
	

}
