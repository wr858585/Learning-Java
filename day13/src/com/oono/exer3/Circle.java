package com.oono.exer3;

public class Circle extends GeometricObject{

	private double radius;
	
	public Circle(){
		super();
		radius = 1.0;
//		下面的代码可以直接删掉，因为直接在顶行调用父类的空参构造器即可（空参构造器已经进行过同样的初始化）
//		color = "white";
//		weight = 1.0;
	}
	public Circle(double radius){
		super();//省去初始化代码两行
		this.radius = radius;
	}
	public Circle(double radius, String color, double weight){
		super(color, weight);//省去赋值操作两行
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
	public boolean equals(Object obj){
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Circle){
			Circle circle = (Circle)obj;
			return this.radius == circle.radius;
		}
		return false;
	}
	
	public String toString(){
		return "Circle [radius=" + radius + "]";
	}
}
