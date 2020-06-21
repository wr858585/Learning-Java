package com.oono.java1;
/*
 * static关键字的使用
 * 
 * 1.static：静态的
 * 2.static：可以用来修饰/调用类的结构中的：属性、方法、代码块、内部类（没有构造器！）
 * 
 * 3.使用static来修饰属性：叫做静态变量
 * 		3.1 属性，按是否使用static修饰，又分为：静态属性 vs 非静态属性（又叫实例属性/实例变量）
 * 		实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的实例变量/实例属性/非静态属性
 * 				当修改其中一个对象中的非静态属性时，不会导致其他对象中的同样的属性值的修改（以前学的）
 * 		静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。
 * 				当通过某一个对象去修改静态变量时，会导致其他对象调用此静态变量时，是修改过的
 * 
 * 
 * 4.使用static来修饰方法：
 * 
 * 
 * 
 * 
 */
public class StaticTest {

	public static void main(String[] args) {
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		c1.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		c2.nation = "China";
		
		System.out.println(c1.nation);//China
		
	}
}

class Chinese{
	
	String name;
	int age;
	static String nation;
	
}