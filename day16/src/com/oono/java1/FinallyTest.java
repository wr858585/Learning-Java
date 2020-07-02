package com.oono.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data != -1){
				System.out.println((char)data);
				data = fis.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fis != null)//没有加括号也没报错
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
