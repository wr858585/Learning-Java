package com.oono.exer1;

import java.awt.Rectangle;

/*
 * 定义一个测试类GeometricTest
 * 编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术）
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）
 * 
 * 笔记：这个情景其实是多态的使用，实际开发中最常用的一种情景，最普遍会用多态的一种情况
 */
public class GeometricTest {
	
	public static void main(String[] args) {
		
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle(2.3, "white", 1.0);
		test.displayGeometricObject(c1);
		Circle c2 = new Circle(3.3, "white", 1.0);
		test.displayGeometricObject(c2);
		
		boolean isEquals = test.equalArea(c1, c2);
		System.out.println("c1和c2的面积是否相等：" + isEquals);
		
		GeometricObject rect = new MyRectangle(2.1, 3.4, "red", 2.0);
		test.displayGeometricObject(rect);
		//注意：rect的类是GeometricObject,而不是MyRectangle,但是也可以用多态来调用重写的方法，而非父类中的虚方法
		
		
	}
	
	public boolean equalArea(GeometricObject o1, GeometricObject o2){
		//代码冗余
//		if(o1.findArea() == o2.findArea()){
//			return true;
//		}
//		return false;
		//直接：
		return o1.findArea() == o2.findArea();
		
	}
	
	//这个方法就是多态性典型的应用/体现：传进去的是父类，调用父类方法为虚方法，运行的是子类重写的方法
	//否则，父类的虚方法run的结果是0.0(GeometricObject类中的findArea方法根本就是直接写成0.0的）
	public void displayGeometricObject(GeometricObject o){
		System.out.println("面积为：" + o.findArea());
	}
	
}
