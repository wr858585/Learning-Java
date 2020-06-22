package com.oono.java2;
/*
 * 单例设计模式：
 * 1. 所谓类的单例设计模式Singleton，就是采取一定的方法，
 * 		保证在整个软件系统中，对某个类只能存在一个对象实例
 * 
 * 2. 如何实现
 * 		饿汉式 vs 懒汉式
 * 
 * 3. 区分饿汉式 vs 懒汉式
 * 		饿汉式：
 * 			坏处：对象加载时间过长
 * 			好处：饿汉式天然就是一个线程安全的
 * 		懒汉式：
 * 			好处： 延迟对象的创建（节省RAM空间）
 * 			坏处：（目前的这种写法）线程不安全 --->到多线程章节时，可以进行修改，优化成安全的
 * 		面试：写饿汉式的（因为懒汉式要写优化过的，安全的，还不会）
 * 
 */
public class SingletonTest1 {

	public static void main(String[] args) {
		
//		private修饰的构造器，只能让它在同一个类的内部访问到，其他位置都不行，从而杜绝了外部造对象
//		Bank bank1 = new Bank();
//		Bank bank2 = new Bank();
		
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		System.out.println(bank1 == bank2);
	}
}

//饿汉式
class Bank{
	
	//1.私有化类的构造器
	private Bank(){
		
	}
	
	//2.内部创建类的对象
	//4.要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	//3.提供公共的方法，返回类的对象
	public static Bank getInstance(){//static是这里的灵魂，否则是一个死锁
		return instance;
	}
	
	
	
}