package com.oono.java;

public class Person extends Creature{
	
	String name;
	private int age;
	
	public Person(){
		
	}
	
	public Person (String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void sleep(){
		System.out.println("睡觉");
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
}
