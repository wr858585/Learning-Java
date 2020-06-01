package com.oono.java1;
/*
 * javaBean是一种由java语言写成的可重用组件
 * 
 * 需要满足下面的三个条件：
 * 1. public class
 * 2. 有一个无参的public constructor
 * 3. 有属性，属性有对应的getter&setter方法
 * 
 */
public class Customer {
	
	//field
	private int id;
	private String name;
	
	//constructor
	public Customer(){
		
	}
	
	//method
	public int getId(){
		return id;
	}
	public void setId(int i){
		id = i;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	
}
