package com.oono.java1;
/*
 * java.lang.Object类
 * 
 * 1. Object类是所有Java类的根父类
 * 2. 如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object
 * 3. Object类中的功能（属性/方法）就具有通用性
 * 
 * 4. Object类没有属性（不然每个类因为都是其子类，都会继承属性，这个属性是没有意义的，没有这种万精油属性）
 * 		有一个空参的构造器，和很多的方法（以及方法有return的再调方法etc）
 * 5. 方法有很多：
 * 		equals() / toString() / getClass() / hashcode() / clone() / finalize() / wait() & notify() 相关的
 * 
 * 面试题：区分final, finally, finalize（前两个是keywords，最后一个是方法名）
 * 
 */
public class ObjectTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		System.out.println(order.getClass().getSuperclass());
//		可以看到当前类的名称 & 父类名称
	}
}

class Order{
	
}