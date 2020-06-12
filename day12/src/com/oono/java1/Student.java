package com.oono.java1;

public class Student extends Person{
	
	String major;
	
	public Student(){
		
	}
	
	public Student(String major){
		this.major = major;
	}
	
	public void study(){
		System.out.println("学习。专业是：" + major);
	}
	
	//覆盖Person类中eat方法，创建一个Student类的独特的eat方法
	public void eat(){
		System.out.println("学生应该多吃有营养的食物");
	}
	
	//这个并不是父类show方法的重写，虽然方法名和形参列表都一样，权限也扩大了。只能是一个新的方法
	//左边没有绿色小三角
	public void show(){
		System.out.println("我是一个学生");
	}
	
	//父类方法返回值为Object类，子类返回值为String类，String类是Object类的子类，所以该方法是重写
	//左边有绿色小三角，点击可以回到父类中被重写的方法
	public String info(){
		return null;
	}
	
	//则子类这个基本数类的返回值类型也必须是同样的基本数类，double，否则报错！不像eat不会报错
	//否则报错：-The return type is incompatible with Person.info1()
	//成功，又有绿色小三角！
	public double info1(){
		return 1.1;
	}
	
	
}
