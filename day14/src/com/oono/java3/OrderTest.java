package com.oono.java3;
/*
 * 对属性可以赋值的位置：
 * ① 默认初始化
 * ② 显式初始化 / ⑤ 在代码块中赋值
 * ③ 构造器中初始化
 * ④ 有了对象以后，通过 对象.属性 或者 对象.方法 的方式，进行赋值
 * 
 * 执行的先后顺序：① - ②/⑤ - ③ - ④
 * 注意：②和⑤谁先执行，取决于谁在前面，谁在后面。所以②和⑤的先后顺序是可以调换的
 * 
 * 
 */
public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		System.out.println(order.orderId);
		
	}
}

class Order{
	
	{
		orderId = 4;
	}
	
	//这样写的话会先执行代码块，赋值成4，再执行显式初始化，赋值成3.
	
	int orderId = 3;
	
	
	
}