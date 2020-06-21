package com.oono.java2;
/*
 * 关于包装类使用的面试题
 * 
 */

import org.junit.Test;

public class InterviewTest {
	
	@Test
	public void test1(){
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);//1.0,因为三元运算符里面的数类要统一（trivial知识点）
		//为什么不是打印出地址值，因为Integer为包装类，不是引用数类，看源码发现o1.toString是重写成return值的
		//toString这个方法的意义就是在于每个类对它进行重写（根据类的不同，打印出不同的所需文本）
		//按英文解释来说：Returns a string representation of the object. 
//		In general, the toString method returns a string that "textually represents" this object. 
	}
	
	@Test
	public void test2(){
		Object o2;
		if (true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2);//1
	}
	
	@Test
	public void test3(){
		Integer int1 = new Integer(1);
		System.out.println(int1);
		System.out.println(int1.toString());
		System.out.println(new Object().toString());
	}
	
	@Test
	public void test4(){
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		
		//Integer内部定义了IntegerCache结构，其中定义了Integer[]，保存了-128~127范围的整数
		//如果我们使用自动装箱的方式，给Integer赋值的范围在已经造好的常用数组的范围内-128~127
		//则可以直接使用数组中的元素，不用再去new了，数组也不会销毁（目的：提高性能效率，这些数用的最频繁）
		
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
		
		Integer x = 128;//刚刚好超过一个-128~127的造好的数组范围，所以其实new了一个对象，所以地址不同
		Integer y = 128;
		System.out.println(x == y);//false
		
		
		
		
		
	}

}
