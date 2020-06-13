package com.oono.java3;

import com.oono.java2.Order;

public class Miscellaneous {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderPublic = 1;
		order.methodPublic();
		
		//同一个project，不同package，又不是子类的类，只能调用public权限的属性和方法
		//其他的private，缺省，protected权限的均不能进行调用
//		order.orderPrivate = 2;
//		order.orderDefault = 3;
//		order.orderProtected = 4;
//		
//		order.methodPrivate();
//		order.methodDefault();
//		order.methodProtected();
		
	}
}
