package com.oono.java1;

import java.sql.Date;

/*
 * 面试题：== 和 equals()的区别
 * 
 * 一、回顾==的使用：
 * ==：is an operator. 运算符
 * 1. 可以使用再基本数类和引用数类中
 * 2. 如果比较的是基本数类的变量：比较的是两个变量保存的 数据 是否相等（不一定数类要相同）
 *    如果比较的是引用数类的变量：比较的是两个对象的地址值是否相同，即是说两个引用是否指向同一个对象实体
 * 
 * 二、equals()方法的是使用：
 * equals(): is a method. 方法
 * 1. 是一个方法，而非运算符
 * 2. 只能适用于引用数类（基本数类不可能能调得动方法，OOP的那些东西都是针对类来说的，一个int c，去c.是什么东西都不可能调出来的）
 * 3. Object类中equals()的定义：
 * 		public boolean equals(Object obj){
 * 				return (this == obj);
 * 		}
 * 		源码说明：Object类中定义的equals()和==的作用是相同的：比较两个对象的地址值是否相同
 * 
 * 4. 像String, Date, File, 包装类等都重写了Object类中的equals()方法
 * 		重写以后，比较的不再是两个引用的地址是否相同；
 * 		而是比较两个对象的“实体内容”是否相同；
 * 
 * 5. 通常情况下，我们自定义的类如果使用equals()的话，也通常是希望比较两个对象的“实体内容”是否相同
 * 		而非地址值，所以就有了自定义类中对根父类Object中equals()重写的需求
 * 		重写的原则：比较两个对象的实体内容是否相同
 * 
 */
public class EqualsTest {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);//true
		System.out.println(i == d);//true(基本数类间：不用非得类型一样才能比，会自动类型提升，再比。又比如+，一个int + 一个double也是，提升了再加）
		
		boolean b = true;
//		System.out.println(i == b);编译就会报错，因为基本数类不和布尔玩儿，没有数据类型提升这种说法
		
		char c = 10;
		System.out.println(i == c);//true.char型就是把单个字符转换成数字，这里没写等号，就是转换后的数字10，所以相等
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);//true.是上面一个测试的补充说明相当于（字符集怎么工作的）
		
		Customer cust1 = new Customer("Tom", 21);
		Customer cust2 = new Customer("Tom", 21);
		System.out.println(cust1 == cust2);//false,因为完全是两个new出来的object，地址自然不同
		
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2);//false，同理
		System.out.println("****************************");
		System.out.println(cust1.equals(cust2));//false --> true（Customer类中重写equals方法后为true,否则为false）
//		调的是Object类写的equals()方法（可以通过移动光标到equals看是调用的哪个类中定义的equals方法），比较的是地址值
		System.out.println(str1.equals(str2));//true,因为调用的是java.lang.String类中重写的方法，而不是根父类Object类中的方法
		
		Date date1 = new Date(3211234978L);
		Date date2 = new Date(3211234978L);
		System.out.println(date1.equals(date2));//true，因为调用的是java.util.Date类中重写的方法，而不是根父类Object类的方法
		
		
	}
}

