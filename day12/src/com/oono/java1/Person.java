package com.oono.java1;

public class Person {
	
	String name;
	int age;
	
	public Person(){
		
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void walk(int distance){
		System.out.println("走路，走的距离是：" + distance + "公里");
	}
	
	//private方法不能被重写，权限太小了
	private void show(){
		System.out.println("我是一个人");
	}
	
	//一个返回值为Object类型的方法
	public Object info(){
		return null;
	}
	
	//一个返回值为基本数类的方法
	public double info1(){
		return 1.0;
	}
	
}
