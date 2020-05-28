package com.oono.java;
/*
 * 
 * 
 */
public class Order {
	
	private int orderPrivate;
	int orderDefault;
	public int orderPublic;
	//protected涉及继承，之后再讲
	
	private void methodPrivate(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	void methodDefault(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	public void methodPublic(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
}
