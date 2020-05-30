package com.oono.exer;
/*
 * 题目要求：
 * 1. 创建程序，定义两个类，Person & PersonTest
 * 2. 用setAge()定义合法年龄（0-130），用getAge()获取年龄
 * 3. 在PersonTest类中对Person类进行实例化生成b，测试封装性
 * 
 */
public class Person {
	
	//私有化属性
	private int age;
	
	//提供getter&setter方法
	public int getAge(){
		return age;
	}
	public void setAge(int i){
		if(i < 0 || i > 130){
//			throw new RuntimeException("传入的数据非法！"); 以后学，抛出异常的写法
			System.out.println("传入的数据非法！");
			return;//这样写相当于写了else，return的灵活运用
		}
		age = i;
	}
	
	
	
}
