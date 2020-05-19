package com.oono.exer1;

/*
 * 定义一个PassObject，在类中定义一个方法printAreas（）
 * 该方法的定义如下：public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到times之间的每个证书半径值，以及对应的面积
 * 例如：times为5，则输出半径为1，2，3，4，5，以及对应的圆面积
 * 
 * 在main方法中call printAreas（）方法，调用完毕后输出当前半径值。
 * 
 */
public class PassObject {

	public static void main(String[] args) {
		PassObject test = new PassObject();

		Circle c = new Circle();

		test.printAreas(c, 5);

		System.out.println("now radius is " + c.radius);
	}

	public void printAreas(Circle c, int times) {

		System.out.println("Radius\t\tArea");

		int i = 1;
		// 设置圆的半径
		for (; i <= times; i++) {
			//循环的初始条件initial statement可以省略，line28已经交代清楚
			//且这样可以在循环结束的外面继续使用i（已经变成6）
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}

		c.radius = i;

	}
}
