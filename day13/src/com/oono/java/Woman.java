package com.oono.java;

public class Woman extends Person{

	boolean isBeauty;
	
	public void goShopping(){
		System.out.println("女人喜欢购物");
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("女人少吃，为了减肥");
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("女人窈窕地走路");
	}
	
}
