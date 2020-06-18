package com.oono.java2;

import java.sql.Date;

import org.junit.Test;

/*
 * Java中的JUnit单元测试
 * 
 * 步骤：
 * 1. 选中当前工程project - 右键选择：build path - add libraries - JUnit 4 - 下一步
 * 2. 创建一个Java类，进行单元测试
 * 		此时的Java类要求：
 * 		① public类
 * 		② 有一个public无参的构造器（比如：不写构造器，则java会默认提供一个带空参的，就ok）
 * 3. 此类中声明单元测试方法：
 * 		此时的单元测试方法：
 * 		也有一定的要求：
 * 		① public方法
 * 		② 没有返回值
 * 		③ 没有形参
 * 4. 此单元测试方法上，需要声明一个注解结构：@Test，并在单元测试类当中导入import org.junit.Test;
 * 		（如果第一步不导入JUnit libraries,则不会在project中添加JUnit（和src，JVM平行的一个包）
 * 		（则也就不能进行第四步的import org.junit.Test了，因为这个Test其实就是JUnit中的一个文件/结构。JUnit都没有的话，import就报错
 * 5. 声明好单元测试方法以后，就可以在方法体内测试相关的代码
 * 6. 写完代码以后，左键双击单元测试方法名，右键：
 * 
 * 说明：
 * 1. 如果执行结果没有任何异常：绿条
 * 2. 如果执行结果出现异常：红条
 * 
 */
public class JUnitTest {

	int num = 10;
	
	@Test
	public void testEquals(){
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));//green bar
		
		Object obj = new String("GG");
		Date date = (Date)obj;//red bar
		
		System.out.println(num);//10
		show();//show()...
		
	}
	
	public void show(){
		num = 20;
		System.out.println("show()...");
	}
	
	@Test
	public void testToString(){
		String s2 = "MM";
		System.out.println(s2.toString());
	}
	
}
