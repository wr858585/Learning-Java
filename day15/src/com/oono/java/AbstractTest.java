package com.oono.java;
/*
 * abstract关键字的使用
 * 
 * 1. abstract：抽象的
 * 2. abstract可以修饰的结构：类、方法
 * 
 * 3. abstract修饰类：抽象类
 * 		> 此类不能实例化
 * 		> 抽象类中一定有构造器（只要是类都有，没写的系统提供空参构造器），便于子类实例化时调用super()
 * 		> 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 * 
 * 4. abstract修饰方法：
 * 		> 抽象方法只有方法的声明，没有方法体 
 * 		> 包含抽象方法的类，一定是一个抽象类。反之，抽象类中是可以没有抽象方法的
 * 		> 若子类重写了父类中的所有的抽象方法后，此子类方可实例化
 * 		    若子类没有重写父类中的所有的抽象方法，则子类也必须是一个抽象类，用abstract去修饰
 * 			否则的话，父类中的抽象方法没有被子类重写，则始终是一个不完整的编译不通过的方法
 * 			去调它就有问题，因为方法调的话就是去执行里面的方法体，而它没有
 * 			但如果被子类重写了，则它是一个虚方法，一定不会被调用，run时执行的是子类重写的方法，就没问题
 * 		> 小结：abstract方法没有方法体，两种解决方案
 * 		（当有了子类时；若只有abstract父类一个类，无所谓因为它不能new对象，没有实例可以调用这个抽象方法的可能）
 * 			① 子类中去重写这个方法，则调用时，一定调用子类重写的方法，ok
 * 			② 子类也声明为abstract类，则不会有实例对象去调用这个抽象方法的可能，ok
 * 
 * 
 */
public class AbstractTest {

	public static void main(String[] args) {
	
//		Person p1 = new Person(); Person cannot be solved to a type
//		p1.eat();
		
		
	}
	
}

abstract class Creature{
	public abstract void breath();
}

abstract class Person extends Creature{
	String name;
	int age;
	
	public Person(){
		
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//不是抽象方法，因为其实{}里面虽然没写东西，仍然有方法体
	public void eat(){
		
	}
	//是抽象方法，没有{}结构.只有方法的声明，没有方法体
	public abstract void ate();
	
	public void walk(){
		System.out.println("人走路");
	}
	
}

class Student extends Person{
	
	public Student(){
		
	}
	public Student(String name, int age){
		super(name, age);
	}
	
	public void ate(){
		System.out.println("学生多吃有营养的事物");
	}
	
	public void breath(){
		System.out.println("学生应该呼吸新鲜的空气");
	}
	
	
}