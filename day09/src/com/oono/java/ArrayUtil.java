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
	
	//查找指定元素（线性查找）
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
	
	//查找指定元素（二分查找）
	public void binarySearch(int[] arr, int dest){
		int head = 0;
		int end = arr.length - 1; //head，end均为index。那就必须-1
//		int middle = (head + end) / 2; 
//		把middle定义在这里反而是不对的，因为middle每次需要刷新，因为end/head均会刷新
//		而middle作为平均值，也应该随end/head的更新而更新，所以定义在loop中可以实现
		boolean isFlag = true;
		while(head <= end){ //要包括相等的情况
			
			//定义middle，每次循环开始的时候刷新新的middle值
			int middle = (head + end) / 2;
			
			if(dest == arr[middle]){ //dest是要与数组的ele相等，而不是index！
				System.out.println(middle);
				isFlag = false;
				break;
			}else if(dest < arr[middle]){
				end = middle - 1;
			}else{ //dest > middle
				head = middle + 1; 
			}
		}
		if(isFlag){
			System.out.println(-1);
		}
	}
}
