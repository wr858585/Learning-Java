package com.oono.java;
/*
 * 二、二维数组
 * 
 * 1.理解
 * arrya1的ele是array_1a,array_1b etc
 * 从底层看，其实并没有二维数组的概念。
 * array1的1st ele指向array_1a整体，2nd ele指向array_1b整体
 * 
 * 2.需要掌握的点
 *   ① 二维数组的声明和初始化
 *   ② 如何call数组的指定位置的ele
 *   ③ 如何获取数组的length
 *   ④ 如何遍历traverse数组
 *   ⑤ 数组ele的默认初始化值
 *   ⑥ 数组的内存解析
 *   
 */

public class ArrayTest2 {
	public static void main(String[] args) {
		
		//1.二维数组的声明和初始化
		int[] arr = new int[]{1,2,3};//一维数组
		
		//1.1静态初始化（标准写法）
//		int[][] arr1 = new int[][]{1,2,3}{2,3}{1,4,5}; is wrong
		int[][] arr1 = new int[][]{{1,2,3},{2,3},{1,4,5}};
		
		//1.2动态初始化（标准写法）
		String[][] arr2 = new String[3][2];//arr2由3个arr组成，每个子arr有2个元素
		String[][] arr3 = new String[3][];//有3个子arr，其长度不确定
		
		//错误的写法
//		String[][] arr4 = new String[][4]; 动态写法错误
//		String[4][3] arr5 = new String[][]; 动态写法错误
//		int[][] arr6 = new int[4][3]{{1,2,3},{4,5},{1,4,5}}; 静态写法错误
		
		//正确的写法（不推荐，但要看懂）
		int[] arr4[] = new int[][]{{1,2,3},{2,3},{3,4}};
		int arr5[][] = new int[][]{{1,2,3},{2,3},{3,4}};
		int arr6[][] = new int[4][3];
		int[] arr7[] = new int[5][];
		//下面的是所谓的类型推断，也正确
		int[][] arr8 = {{1,2,3},{2,3}};
		int[] arr9 = {1,2,3,4,5};
		//但如果是声明和初始化分开写的，java无法做类推，所以不行
//		ids = {1001,1002,1003}; 就不行
//		因为没有声明ids为array，省略new int[]后无法类推
		
	}
	
}
