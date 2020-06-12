package com.oono.java;
/*
 * OOP特征之二：继承性inheritance
 * 
 * 一、好处
 * 1. 减少了代码的冗余，提高了代码的复用性
 * 2. 便于功能的扩展
 * 3. 为之后的多态性polymorphic的使用提供了前提
 * 
 * 二、继承性的格式：class A extends B{}
 * 		A：子类/派生类 subclass
 * 		B: 父类/超类/基类 superclass
 * 
 * 		2.1  体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的结构：主要是属性和方法
 * 			特别的，父类中声明为private的属性和方法，子类继承父类后，仍然认为获取了父类中私有的结构
 * 			只是因为encapsulation，使得子类不能直接调用父类的结构而已
 * 			所以，Encapsulation和Inheritance二者并不冲突，各司其职
 * 		
 * 		2.2 子类继承父类以后，还可以声明自己特有的属性或方法：实现自己的独有性/功能扩展
 * 		子类和父类的关系，不同于子集和集合的关系，子集的丰富性小于集合
 * 		而父类的功能要单一一些，而子类的功能要丰富一些
 * 
 * 		extends:延展、扩展
 * 
 * 三、Java中关于继承性的一些规定
 * 1. 一个类可以被多个子类继承
 * 2. Java中类的但继承性：一个类只能有一个父类（不用于C++，可以一个子类多个父类，多重继承）
 * 3. 子父类是相对的概念，可以多层继承（直接父类/间接父类）
 * 4. 子类继承夫欸以后，就获取了直接父类和间接父类的属性和方法
 * 
 * 四、1. 如果我们没有显示的声明一个类的父类的话，则此类继承于java.lang.Object类
 * 	   2. 所有的java类都直接或间接的继承于java.lang.Object类（除了它自己）
 * 	   3. 所有的java类都具有java.lang.Object类中声明的功能  	i.e通用功能（之后会介绍有什么功能）
 * 
 */
public class ExtendsTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
//		p1.age = 1;
		p1.eat();
		
		
		Student s1 = new Student();
		s1.eat();
		s1.sleep();
		s1.name = "Tom";
		
		s1.setAge(10);
		System.out.println(s1.getAge());
		
		s1.breath();
		
	}
}
