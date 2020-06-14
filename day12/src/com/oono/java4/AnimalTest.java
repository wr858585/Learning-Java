package com.oono.java4;

import java.sql.Connection;

/*
 * 多态性的使用举例一：
 */
public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Dog());
//		狗吃骨头
//		汪！汪！汪！
		
		test.func(new Cat());
		
		//多态性的好处和意义：如果没有多态性，会被迫去写很多重载（非重写）的方法来实现功能，有了大大减少代码量
		
	}
	
	
	public void func(Animal animal){
		animal.eat();
		animal.shout();
	}
	
	

}

class Animal{
	
	public void eat(){
		System.out.println("动物：进食");
	}
	
	public void shout(){
		System.out.println("动物：叫");
	}
	
	//如果没有多态性，则不能直接animal.eat(dog); animal.shout(cat); 这样来调，只能写方法
	//写的是：每个功能的方法，都必须写N个重载，针对不同形参一个一个创建重载的方法，才能调用
	//代码量太大，效率极地
//	public void func(Dog dog){
//		dog.eat();
//		dog.shout();
//	}
//	public void func(Cat cat){
//		cat.eat();
//		cat.shout();
//	}
}

class Dog extends Animal{
	
	public void eat(){
		System.out.println("狗吃骨头");
	}
	
	public void shout(){
		System.out.println("汪！汪！汪！");
	}
}

class Cat extends Animal{
	
	public void eat(){
		System.out.println("猫吃鱼");
	}
	
	public void shout(){
		System.out.println("喵！喵！喵！");
	}
}

//举例二：形参定义成Object类的方法，具有广泛适用性，因为都是Object类的子类，都可以用这个方法

class Order{
	
	public void method(Object obj){
		
	}
}

//举例三：
class Driver{
	
	public void doData(Connection conn){//conn = new MySQlConnection(); / conn = new OracleConnection();
		//规范的步骤去操作数据
//		conn.method1();
//		conn.method2();
//		conn.method3();
		
		
	}
	
}