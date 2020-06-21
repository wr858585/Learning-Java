package com.oono.java;

import org.junit.Test;

public class ReviewTest {
	
	//关于toString()
	@Test
	public void test2(){
		String s = "abc";
		String p = null;
		System.out.println(s);//abc
		System.out.println(s.toString());//abc
		System.out.println(p);//null
		System.out.println(p.toString());//NullPointerException
	}
	
	
	

	@Test
	public void test1(){
		int[] arr = new int[]{1,2,3};
		print(arr);//证明数组也可以作为Object类的子类传进print方法，说明数组是一个特殊的类，继承根父类Object
		
		System.out.println(arr.getClass());//arr能.Object类的方法，也说明了继承于根父类Object
		System.out.println(arr.getClass().getSuperclass());
	}
	
	public void print(Object obj){
		System.out.println(obj);
	}
	
	
	
}
