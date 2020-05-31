package com.oono.java1;
/*
 * 类的结构之三：构造器/构造方法
 * 
 * 一、构造器的作用
 * 1. 创建对象
 * 2. 初始化对象的信息
 * 
 * 二、说明：
 * 1. 如果没有显式的定义类的constructor的话，则系统默认提供一个空参的构造器
 * 2. 如果要自己customize一个构造器，则格式为：
 * 		access modifier/specifier + class name (Arg_list){}
 * 		p.s class name -- > 与当前类同名
 * 3. 构造器可以有多个，彼此间的区别和overloading是一样的，表现为形参列表不同
 * 		i.e 同一个类中的多个构造器构成重载
 * 4. 一旦显示的定义了构造器，则系统不会再提供默认的空参构造器了（没有参数的一个constructor）
 * 5. 所以任何一个类，至少会有一个构造器
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		
		//创建一个对象：就是new + constructor
		//这里，new后面的Person()就是一个构造器
		Person p1 = new Person("大野");
		System.out.println(p1.name);
	}
}

class Person{
	
	//field
	String name;
	int age;
	
	//constructor
	public Person(){
		System.out.println("Person()...");
	}
	
	public Person(String n){
		name = n;
	}
	
	
	//method
	public void eat(){
		System.out.println("人吃饭");
	}
	public void study(){
		System.out.println("人可以学习");
	}
	
	
}