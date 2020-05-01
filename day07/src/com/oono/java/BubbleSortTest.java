package com.oono.java;
/*
 * array的冒泡排序
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		
		int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
		
		//冒泡排序bubble sort
		for(int i = 0; i < arr.length - 1; i++){
			
			for(int j = 0; j < arr.length - 1 - i; j++){//想不出条件，举例子，据数字找规律
				
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
