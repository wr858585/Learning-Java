package com.oono.java3;

import com.oono.java2.Order;

public class SubOrder extends Order {
	
	public void method(){
		orderProtected = 1;
		orderPublic = 2;
		
		methodProtected();
		methodPublic();
		
		
		//在不同package中，如果是子类，可以用public和protected权限的属性和方法，缺省和private不行
//		orderDefault = 3;
//		orderPrivate = 4;
//		
//		methodDefault();
//		methodPrivate();
//		
		
	}
	
}
