package com.oono.java1;
//static关键字的应用
public class CircleTest {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = new Circle();
		
		Circle c3 = new Circle(3.4);
		
		System.out.println("c1的id：" + c1.getId());
		System.out.println("c2的id：" + c2.getId());
		System.out.println("c3的id：" + c3.getId());
		
		System.out.println("创建的圆的个数为：" + Circle.getTotal());
		
	}
}

class Circle{

	//field
	private double radius;
	private int id;
	
	//static field
	private static int total;//记录早了多少个圆的对象
	private static int init = 1001;//如果init是非静态属性，则所有的id全部是1001，不能自增1
	
	//constructors
	public Circle(){
		id = init++;//自动给每个new的对象，初始化id值，且从指定的起始值（1001）自增1。妙！
		setTotal(getTotal() + 1);
	}
	
	public Circle(double radius){
		this();
		this.radius = radius;
//		下面两行被this()替换了，更简洁
//		id = init++;
//		total++;
	}
	
	
	//getter&setter
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	//用f1自动生成的total的getter和setter，因为属性total是静态的，所以生成的getter，setter也是静态的
	/**
	 * @return the total
	 */
	public static int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public static void setTotal(int total) {
		Circle.total = total;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	//method
	public double findArea(){
		return 3.14 * radius * radius;
	}
	
	
}