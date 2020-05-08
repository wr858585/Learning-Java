package com.oono.exer;
/*
 * 2.利用OOP的编程方法，设计类Circle计算圆的面积(method with return value)
 */
//测试类
public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		c1.radius = 2.1;
		
		double area = c1.findArea();
		System.out.println(area);
	}
}

//圆
class Circle{
	
	//field
	double radius;
	
	//method
	public double findArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
}