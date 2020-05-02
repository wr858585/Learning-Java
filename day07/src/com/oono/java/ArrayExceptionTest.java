package com.oono.java;
/*
 * array中的常见异常：
 * 1.数组index越界的异常：ArrayIndexOutOfBoundsException
 * 2.空指针异常：NullPointerException
 */
public class ArrayExceptionTest {
	public static void main(String[] args) {
		
		//2.空指针异常：NullPointerException
		//情况一：
		int[] arr1 = new int[]{1,2,3};
		arr1 = null;
//		System.out.println(arr1[0]);//java.lang.NullPointerException
		
		//情况二：
		int[][] arr2 = new int[4][];
		System.out.println(arr2[0]);//null
//		System.out.println(arr2[0][0]);//java.lang.NullPointerException
		
		//情况三：
		String[] arr3 = new String[]{"AA","BB","CC"};
		arr3[0] = null;
		System.out.println(arr3[0].toString());//java.lang.NullPointerException
	}
}
