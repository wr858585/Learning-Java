package com.oono.java;

/*
 * array.algorithm的考察点之三：array的复制/反转/查找
 * 
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[] { "JJ", "DD", "MM", "BB", "GG", "AA" };

		// 3.1数组的复制
		String[] arr1 = new String[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		
		//3.2数组的反转
		//方法一
		for(int i = 0; i < arr.length / 2; i++){//如果长度不减半，则后半段又会换回去
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
		//遍历
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
		//方法二
		for(int i = 0, j = arr1.length - 1; i < j; i++, j--){
			String temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
		}
		
		//遍历
		System.out.println();
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + "\t");
		}
		
	}
}
