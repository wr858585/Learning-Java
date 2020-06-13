package com.oono.java3;

public class Person {
	
	//field
	String name;
	int age;
	int id = 1000;//身份证号
	
	//constructor
	public Person(){
	}
	public Person(String name){
		this.name = name;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//method
	public void eat(){
		System.out.println("人：吃饭");
	}
	public void walk(){
		System.out.println("人：走路");
	}
	
	
	
}
