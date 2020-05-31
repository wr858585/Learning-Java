package com.oono.exer;
/*
 * 对TriAngle类进行测试
 */
public class TriAngleTest {
	public static void main(String[] args) {
		
		TriAngle triangle = new TriAngle(3,4);
		
		triangle.getArea();
		
		triangle.setBase(4);
		triangle.setHeight(5);
		triangle.getArea();
	}
}
