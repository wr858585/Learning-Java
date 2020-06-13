package com.oono.java2;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderProtected = 2;
		order.orderPublic = 3;
		
		order.methodDefault();
		order.methodProtected();
		order.methodPublic();
		
		//同一个package中的其他class，不可以调用Order类中权限为private的属性和方法
	}
}
