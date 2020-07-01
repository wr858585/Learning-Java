package com.oono.java;

import java.io.FileInputStream;

import org.junit.Test;

/*
 * try-catch-finally中finally的使用
 * 
 * 1. finally是可选的optional
 * 2. finally中声明的是一定会被执行的代码。
 * 		即使catch中又出现异常了/try中有return语句/catch中有return语句，它也先能执行一次（作用凸显）
 * 3. 像数据库连接、输入输出流、网络编程中的socket等资源，JVM是不能自动回收的，
 * 		则需要我们自己手动地去进行资源释放 ---> 用finally来完成（不管有没有异常，我一定要释放掉这些）
 * 
 * 
 */
public class FinallyTest {
	
	
	@Test
	public void test2(){
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1){
			System.out.println((char)data);
			data = fis.read()
		}
		
		fis.close();
	}
	
	@Test
	public void testMethod(){
		int num = method();
		System.out.println(num);
	}
	public int method(){
		try{
			int[] arr = new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			return 2;
		}finally{
			System.out.println("我一定会被执行");
//			return 3;
		}
	}

	@Test
	public void test1(){
		try{
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		}catch(ArithmeticException e){
//			e.printStackTrace();
			
			int[] arr = new int[10];
			System.out.println(arr[10]);//catch中又出现异常，但是finally就保证其里面的东西能执行
			
		}catch(Exception e){
			e.printStackTrace();
		}
//		System.out.println("我好帅啊！！！");
		
		finally{
			System.out.println("我好帅啊");
		}
	}

}
