package com.oono.java;

public class Man extends Person{
	
	boolean isSmoking;
	
	int id = 1002;
	
	public void earnMoney(){
		System.out.println("男人负责挣钱养家");
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("男人多吃肉，长肌肉");
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("男人霸气的走路");
	}
}
