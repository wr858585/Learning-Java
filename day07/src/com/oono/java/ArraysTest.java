package com.oono.java;

import java.util.Arrays;

/*
 * java.util.Arrays:操作数组的工具类，里面定义了许多操作数组的方法
 */
public class ArraysTest {
	public static void main(String[] args) {
		
		//1.boolean equals(int[] a,int[] b):判断两个arrays是否相等
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{1,3,2,4};
		boolean  isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);//false，因为array是有序的，index对应的ele要完全一样才是equals
		
		//2.String toString(int[] a):输出array的信息（不用自己写for loop来遍历了）
		System.out.println(Arrays.toString(arr1));//{1,2,3,4}
		
		//3.void fill(int[] a,int val):将指定value填充到array中
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));//{10,10,10,10}
		
		//4.void sort(int[] a):对数组排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//5.int binarysearch(int[] a,int key):二分法查找
		int index = Arrays.binarySearch(arr2,5);
		System.out.println(index);//-5 凡是找不到的都返回某个负数，值不定。
		int index1 = Arrays.binarySearch(arr2, 1);
		System.out.println(index1);//找到的返回第一个找到的index
	}
}
