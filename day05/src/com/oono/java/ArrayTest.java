package com.oono.java;

/*
 * 一、数组的概述
 * 
 * 1.DF
 * >数组Array，是多个数类相同的按一定顺序排列的集合。
 * >使用一个名字给VAR命名，通过编号index来管理。
 * 
 * 2.相关的概念
 * >数组名
 * >元素
 * >角标/下表/索引 --> index
 * >数组的长度:数组中元素的个数
 * 
 * 3.特点
 * 1>有序排列的
 * 2>当创建数组OB时，JAVA会再RAM中开辟一整块连续的空间
 * （不像PYTHON中的list，JAVA中也有list，不是连续的）
 * 3>数组的长度一旦确定，无法修改（也跟PYTHON的list不一样）
 * 
 * 4.分类
 * 1>按维数分类：一维数组、二维数组etc
 * 2>按其元素分类：基本数类元素的array、引用数类元素的array
 *
 * 4.数类
 * >引用数据类型（一共三种：类（如STR）、数组Array、接口API）
 * >Array中的元素可以为任意数类
 * 
 * 5.一维数组的使用
 *   ① 一维数组的声明和初始化
 *   ② 如何call数组的指定位置的ele
 *   ③ 如何获取数组的length
 *   ④ 如何遍历traverse数组
 *   ⑤ 数组ele的默认初始化值,see ArrayTest1.java
 *   ⑥ 数组的内存解析, see ArrayTest1.java
 *   
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		//① 一维数组的声明和初始化
		int num;//声明 declaration
		num = 10;//初始化 initialization
		int id = 1001;//声明+初始化 (option2)
		
		int[] ids;//[]表明ids这个VAR的类型声明为array，int表示其元素为int类
		
		/*1.1 静态初始化:
		array的初始化和其ele的赋值操作同时进行
		适用于我们已知元素内容，直接将array写好到位
		*/
		ids = new int[]{1001,1002,1003,1004};
		
		//1.2 动态初始化
		String[] names = new String[5];//5为数组长度/ele个数
		/*array的初始化和其ele的复制操作分开进行
		适用于先造array结构，之后需要的时候往里添加ele
		*/
		
		/*错误的写法
		 * int[] arr1 = new int[]; ->右边漏写length，动态
		 * int arr2 = new int[3]{1,2,3}; ->右边多写了
		 * 小结：静态写死了，相当于赋值，所以左边没[] -> int num = new int[]{a,b,c}
		 * 		 动态没写死，所以左边有[] 		   -> int[] num = new int[3]
		 */
		
		//小结：数组一旦初始化完成，其长度就确定了，不可更改。
		//intuition：长度确定了，RAM才分出相应大小的区域给该array（因为连续）
		
		//2.如何call指定ele：index
		//index starting at 0 and ending at (length-1)
		
		names[0] = "大野";//若想获取str的第一个字，用charAt(0) --> 大
		names[1] = "杉山";
		names[2] = "小丸子";
		names[3] = "小玉";
		names[4] = "花轮";
		//names定义的时候为 = new String[5],所以长度为5
		//如果再def names[5],编译可以通过，运行不通过
		//error为ArrayIndexOutOfBoundsException
		
		//只要不是和数据库相关的代码（index从1开始），java的index都是从0开始
		
		//3.如何获取数组的length
		//length是一个attribute
		System.out.println(names.length);//5
		System.out.println(ids.length);//4
		
		//4.如何遍历array
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		
		
	}

}
