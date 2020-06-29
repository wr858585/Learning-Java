package com.oono.java;
/*
 * 1. 在局部内部类的方法中，如果调用外部类所声明的方法(比如：method())中的局部变量的话，
 * 		则要求此局部变量要声明为final的（JDK8及以后中不用写出来，JDK7及以前要明确声明为final的变量）
 * 2. JDK7及之前的版本：要求此局部变量要显式地声明为final的
 * 	  JDK8及以后的版本：可以省略final的声明（但仍为final的）
 */
public class InnerClass {

	
	public void method(){
		//局部变量
		int age = 10;
		
		class AA{
			
			public void show(){
				
//				age = 20; Local variable age defined in an enclosing scope must be final or effectively final
				System.out.println(age);//10
				
			}
		}
	}
}
