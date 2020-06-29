package com.oono.java;
/*
 * Error:
 * Java虚拟机无法解决的问题。如：JVM系统内部错误、资源耗尽等严重情况。
 * 比如：StackOverflowError栈溢出，OOM(OutOfMemoryError)堆空间溢出
 * 
 * 一般不编写针对性的代码进行处理（广义上的异常包括Error和Exception，更多需要我们用代码处理/提示的是Exc）
 */
public class ErrorTest {

	public static void main(String[] args) {
		//1. 栈溢出：java.lang.StackOverflowError
		main(args);//StackOverflowError
		//2. 堆溢出：java.lang.OutOfMemoryError
		Integer[] arr = new Integer[1024 * 1024 * 1024];
	}
}
