package com.oono.exer1;
/*
 * 使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问
 */
public class EmployeeTest {

	public static void main(String[] args) {
		
		//多态（正因为有了多态这个OOP的精髓之一，抽象类才有了意义，因为它自己不能new对象，那只能靠子类new子类对象，然后通过多态来用父类中的结构）
		Employee manager = new Manager("库克", 1001, 5000, 50000);
		manager.work();
		
		CommonEmployee comm = new CommonEmployee();
		comm.work();
		
	}
}
