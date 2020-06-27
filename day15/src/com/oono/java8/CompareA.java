package com.oono.java8;
/*
 * JDK8：接口中除了可以定义全局常量和抽象方法外，还可以定义静态方法和默认方法
 * 
 */
public interface CompareA {

	//静态方法
	public static void method1(){
		System.out.println("CompareA:北京");
	}
	
	//默认方法
	public default void method2(){
		System.out.println("CompareA:上海");
	}
	
	//因为接口中的都是public的方法，所以可以省略
	default void method3(){
		System.out.println("CompareA:上海");
	}
	
	
	
	
}
