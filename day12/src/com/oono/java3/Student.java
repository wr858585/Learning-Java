package com.oono.java3;

public class Student extends Person{
	
	//field
	String major;
	int id = 2000;//学号
	
	//constructor
	public Student(){
		
	}
	public Student(String major){
		super();
		this.major = major;
	}
	
	//用super来调用父类的构造器，提高复用性
	public Student(String name, int age, String major){
		//用super来调用父类已经有的构造器，比直接用this好，因为如果父类的属性权限小了，
		//this就访问不到，当然this去调setter方法也是可以的，但是习惯上我们用super调构造器更规范简洁
		//this.name = name;
		//this.age = age;
		super(name, age);
		this.major = major;
		
	}
	
	
	//method
	@Override
	public void eat(){
		System.out.println("学生多吃有营养的食物");
	}
	
	public void study(){
		System.out.println("学生：学习知识");
		this.eat();
		super.eat();
	}
	
	public void show(){
		//下面两行输出结果都是一样的。
		System.out.println("name = " + name + ", age = " + age);
		System.out.println("name = " + this.name + ", age = " + super.age);
		System.out.println("id = " + id);//学号2000，和this.id一样调出来的是当前子类的属性
		System.out.println("id = " + super.id);//身份证号1000
		
		
		
	}
	
	
}
