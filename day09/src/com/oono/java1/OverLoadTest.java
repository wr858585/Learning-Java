package com.oono.java1;
/*
 * 方法的重载（Overload) loading...
 * 
 * 1.Definition
 * 		在同一个class中，java允许存在多个method with the same name
 * 		as long as 要么arg 个数不同 要么arg 类型不同
 * 		助记：两同一不同
 * 			两同：方法名相同 & 同一个类下面定义的（因为不同的class下当然可以同名var，method etc，互不影响）
 * 			一不同：参数列表Arg list不一样：要么Arg数量不一样，要么Arg数类不一样
 * 2.e.g
 * 		Arrays类中重载的sort() / binarySearch()
 * 		又好比自己创建的ArrayUtil.java工具类，其实只有针对int[]数组类的方法
 * 		如果要e.g反转一个String，则要重载reverse方法，针对String类型
 * 
 * 3.判断是否有重载
 * 		跟方法的access specifiers/modifiers,返回值类型，形参的名字，方法体都没有关系
 * 
 * 4.在call method时候，如何确定某一个指定的方法，而不是重载的其他方法（不能光指定method name了）
 * 		方法名 ---> 参数列表
 */
public class OverLoadTest {
	
	//如何4个方法构成了重载
	public void getSum(int i, int j){
		System.out.println(i + j);
	}
	
	public void getSum(double i, double j){
		System.out.println(i + j);
	}
	
	public void getSum(String s, int i){
	}
	
	public void getSum(int i, String s){	
	}
	//arg位置不同也是重载
}
