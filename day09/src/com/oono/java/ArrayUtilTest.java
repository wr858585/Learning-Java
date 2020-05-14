package com.oono.java;
/*
 * 对创建的ArrayUtil工具类进行测试
 */

public class ArrayUtilTest {
	public static void main(String[] args) {

		ArrayUtil test = new ArrayUtil();//创建一个ArrayUtil类的obj
		int[] arr = new int[]{1,5,2,4,3};//测试用数组
		
		//1.测试max, min, sum, average
		System.out.println(test.getMax(arr));//call test中的getMax方法
		System.out.println(test.getMin(arr));
		System.out.println(test.getSum(arr));
		System.out.println(test.getAverage(arr));
		System.out.println("****************");

		//2.测试遍历
		test.traverse(arr);
		System.out.println(arr);
		System.out.println("****************");
		
		//3.测试反转
		test.reverse(arr);
		test.traverse(arr);
		test.reverse(arr);
		System.out.println("****************");
		
		//4.测试复制
		int[] arr1 = test.copy(arr);
		test.traverse(arr1);
		System.out.println(arr1);
		System.out.println("****************");
		
		//5.测试排序
		test.bubbleSort(arr);
		test.traverse(arr);
		
		//6.测试线性查找
		test.linearSearch(arr, 5);//注意arr已经被排序成{1,2,3,4,5}
	}
}
