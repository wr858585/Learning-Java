package com.oono.java1;
/*
 * 关于var的赋值
 * 
 * 如果var是基本数类，则assign的是var存储的value
 * 如果var是引用数类，则assign的是var存储的address
 * 
 * 
 */
public class ValueTransferTest {
	
	public static void main(String[] args) {
		
		System.out.println("**************基本数类***************");
		int m = 10;
		int n = m;
		
		System.out.println("m = " + m + ", n = " + n);
		
		n = 20;
		
		System.out.println("m = " + m + ", n = " + n);
		
		System.out.println("**************引用数类***************");

		Order o1 = new Order();
		o1.orderId = 1001;
		
		Order o2 = o1;
		
		System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId);
		
		o2.orderId = 1002;
		
		System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId);
		
		
	}
}

class Order{
	
	int orderId;
}
