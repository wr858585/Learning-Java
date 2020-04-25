package com.oono.java;
/*
 * ⑤ 元素的default value:
 * >基本数类
 * 		> int: 0
 * 		> float: 0.0
 * 		> char: 0或者'\u0000' (不是'0') i.e 是0（编码），实际转换为xx
 * 		> boolean: false (因为false底层是0储存的)
 * >引用数类
 * 		> String: null (不是"null") null是一个关键字
 * ⑥ 数组的内存解析 i.e array这个ob再ram中是如何存储/运行的
 * 
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		//5.array中元素的默认初始化值
		int[] arr = new int[4];
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		boolean[] arr2 = new boolean[2];
		System.out.println(arr2[0]);
		
		String[] arr3 = new String[5];
		System.out.println(arr3[0]);
		//it is a test
		
	}
}
