package com.oono.exer1;

public class Circle extends GeometricObject{
	
	private double radius;
	
	public Circle(double radius, String color, double weight){
		super(color, weight);
		this.radius = radius;
		//下面无脑写父类中两个属性是不对的，因为此题中父类没有空参构造器，如果子类不显式调用，则会super()，报错
//		this.color = color;
//		this.weight = weight;
	}
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	@Override
	public double findArea() {
		return Math.PI * radius * radius;
	}
	
}
