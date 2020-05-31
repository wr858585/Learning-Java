package com.oono.exer;
/*
 * 对Person类的封装性进行测试
 */
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
//		p1.age = 18; 已经没法call了因为私有化了 （The field Person.age is not visible）
		
		p1.getAge();
		System.out.println("年龄：" + p1.getAge());//年龄：0
		p1.setAge(18);
		System.out.println("年龄：" + p1.getAge());//年龄：18
		
	}
}
