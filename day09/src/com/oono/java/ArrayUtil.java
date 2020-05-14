package com.oono.java;
/*
 * 自定义的array工具类
 */
public class ArrayUtil {
	
	
	//求数组的max
	public int getMax(int[] arr){
		int maxValue = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > maxValue){
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	//求数组的min
	public int getMin(int[] arr){
		int minValue = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < minValue){
				minValue = arr[i];
			}
		}
		return minValue;
	}
	
	//求数组的sum
	public int getSum(int[] arr){
		int sum = arr[0];
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	//求数组的average
	public int getAverage(int[] arr){
		int average = arr[0];
		int sum = arr[0];
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		average = sum/arr.length;
		return average;
	}
	
	//反转数组
	public void reverse(int[] arr){
		for(int i = 0; i < arr.length / 2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
	
	//复制数组
	public int[] copy(int[] arr){
		int[] arr_1 = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			arr_1[i] = arr[i];
		}
		return arr_1;
	}
	
	//数组排序
	public void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	//遍历数组
	public void traverse(int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(i < arr.length - 1){
				System.out.print(arr[i] + ",");
			}else{
				System.out.println(arr[i]);
			}
		}
	}
	
	//查找指定元素
	public void linearSearch(int[] arr, int dest){
		boolean isFlag = true;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == dest){
				isFlag = false;
				System.out.println(i);;
			}
		}
		if(isFlag){
			System.out.println(-1);;
		}
	}
}
