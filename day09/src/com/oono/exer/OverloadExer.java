package com.oono.exer;

/*
 * 小练习 1.定义三个overload方法并call。方法名为mOL
 * 		三个方法分别接受一个int参数、两个int参数、一个字符串参数
 * 		分别执行平方运算并输出结果，相乘并输出结果，输出字符串info
 * 
 * 小练习 2.定义三个overload方法max（）
 * 		第一个求两个int中的最大值
 * 		第二个求两个double中的最大值
 * 		第三个求三个double中的最大值
 * 		并分别call这三个方法
 */
public class OverloadExer {

	// 1.如下的三个方法构成overload
	public void mOL(int i) {
		System.out.println(i * i);
	}

	public void mOL(int i, int j) {
		System.out.println(i * j);
	}

	public void mOL(String str) {
		System.out.println(str);
	}

	// 2.如下的三个method构成overload
	public int max(int i, int j) {
		return (i > j) ? i : j;// 三元运算符处理这种简单的逻辑很方便快速
	}

	public double max(double d1, double d2) {
		return (d1 > d2) ? d1 : d2;
	}

	public double max(double d1, double d2, double d3) {
		double bigger = (d1 > d2) ? d1 : d2;
		return (bigger > d3) ? bigger : d3;
	}

}