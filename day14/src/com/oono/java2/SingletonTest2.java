package com.oono.java2;
/*
 * 单例模式的懒汉式实现
 * 
 * 
 */
public class SingletonTest2 {

	public static void main(String[] args) {
		
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		
		System.out.println(order1 == order2);//true
		
		
	}
}

class Order{
	
	//1.私有化类的构造器
	private Order(){
		
	}
	
	//2.声明当前类对象，没有初始化
	//4.此对象也需要声明为static的
	private static Order instance = null;//和饿汉式的单例不同，不在类内部new这个对象，=null可以省略
	
	//3.声明public、static的返回当前类对象的方法
	public static Order getInstance(){
//		instance = new Order();
//		return instance;
//		这是不行的，因为每次调用静态方法都new一个Order，违背单例初衷
		if(instance == null){
			instance = new Order();
		}
		return instance;
	}
	
}