package com.oono.java;
/*
 * 
 * 
 * 
 */
public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		//测试各类修饰符对order类中的属性和方法的限制程度
		order.orderPublic = 1;
		order.orderDefault = 2;
//		order.orderPrivate = 3;无法直接调用,private只能在同一个类的内部
		
		order.methodPublic();
		order.methodDefault();
//		order.methodPrivate();也是提示not visible
		
	}
}
