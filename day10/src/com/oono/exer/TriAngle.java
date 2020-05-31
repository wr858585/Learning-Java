package com.oono.exer;
/*
 * 编写两个class，TriAngle和TriAngleTest
 * 第一个类中声明私有的底边长base和高height，提供方法访问
 * 此外，提供必要的构造器
 * 测试类中，使用这些公共方法，并计算三角形的面积
 * 
 */
public class TriAngle {

	//field
	private double base, height;
	
	//constructor
	public TriAngle(double b, double h){
		base = b;
		height = h;
	}
	
	//method
	public double getBase(){
		return base;
	}
	
	public void setBase(double b){
		base = b;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double h){
		height = h;
	}
	
	public void getArea(){
		System.out.println("三角形的面积为：" + base * height / 2);
	}
	
}
