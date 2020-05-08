package com.oono.exer;
/*
 * 2.利用OOP的编程方法，设计类Circle计算圆的面积(method without return value)
 */
public class CircleTest1 {
	public static void main(String[] args) {
		
		Circle1 c1 = new Circle1();
		
		c1.radius = 2.1;
		
		c1.findArea();
	}
}

//圆class
class Circle1{
	
	//field
	double radius;
	
	//method
	public void findArea(){
		System.out.println(Math.PI * radius * radius);
	}
	
}