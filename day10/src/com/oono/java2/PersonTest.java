package com.oono.java2;
/*
 * this关键字的使用
 * 
 * 1. this可以修饰/调用：field，method，constructor
 * 
 * 2. this修饰属性/方法：this表示当前对象
 * 		在类的方法中，可以使用this.field or this.method的方式来call当前对象的field/method
 * 		但是通常情况下，我们都选择可以省略this.
 * 		在特殊情况下，不能省略。
 * 		如：方法的形参和类的field同名，则必须显式地使用this.的方式来表示这里的是field，而非形参
 * 
 * 3. this调用/修饰构造器的说明
 * 		① 我们在类的构造器中，可以通过this.的方式，显式地来调用其他构造器
 * 			这样就避免了重复写代码（因为调用吼不需要再去写被调用constructor里面的代码了）
 * 			注意：这种调用是在同一个类中的constructor可以互相通过this调用
 * 					因为this关键字意思本来就是指代‘当前对象的’
 * 		
 */
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
	}
}

class Person{
	
	//field
	String name;
	int age;
	
	//constructor
	Person(){
		
	}
	
	//method
	public void setName(String name){
		this.name = name;//this.name代表的是the name in this object，当前对象的name（属性），而非形参（等号右边）
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
}