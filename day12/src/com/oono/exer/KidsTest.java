package com.oono.exer;
/*
 * 定义类KidsTest，进行测试：用Kids创建实例化对象someKid，用该对象访问其父类的长远变量及方法
 * 
 * 
 */
public class KidsTest {
	public static void main(String[] args) {
		
		Kids someKid = new Kids(12);
		
		someKid.printAge();
		
		someKid.setSalary(0);
		someKid.setSex(1);
		
		someKid.employed();
		someKid.manOrWoman();
		
		
	}
}
