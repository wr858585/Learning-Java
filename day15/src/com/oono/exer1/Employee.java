package com.oono.exer1;
/*
 * 编写一个Employee类，声明为抽象类。
 * 包含三个属性：name，id，salary
 * 提供必要的构造器和抽象方法:work()
 * 
 * 
 */
public abstract class Employee {

	private String name;
	private int id;//实际开发中id很多时候写成String类
	private double salary;
	
	public Employee(){//abstract没有说可以修饰构造器啊，因为没有实际开发的意义。回顾：abstract可以修饰的结构是：类&方法
		
	}
	public Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public abstract void work();
	
}
