package com.oono.exer1;

public class Cylinder extends Circle{
	
	private double length;
	
	public Cylinder(){
		length = 1.0;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	public double getLength(){
		return length;
	}
	
	public double findVolome(){
		return super.findArea() * getLength();//这样就不会调用重写的方法，而是superclass的方法
	}
	
	@Override
	public double findArea() {//返回圆柱的表面积
		return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength(); 
	}
	
	
	
}
