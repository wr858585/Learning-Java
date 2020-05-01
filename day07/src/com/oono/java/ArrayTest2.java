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

		// 3.2数组的反转
		// 方法一
		for (int i = 0; i < arr.length / 2; i++) {// 如果长度不减半，则后半段又会换回去
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		// 遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// 方法二
		for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {
			String temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
		}

		// 遍历
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}

		// 3.3数组的查找（也叫搜索）
		// 3.3.1线性查找
		String dest = "BB";// destination的简称
		Boolean isFlag = true;
		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			if (dest.equals(arr[i])) {
				System.out.println("找到了指定的元素，位置为：" + i);
				isFlag = false;
				break;
			}
		}

		if (isFlag) {// 相当于if(isFlag = true){
			System.out.println("很遗憾，没有找到哦！");
		}

		// 3.3.2二分法查找binary search
		// 使用前提：索要查找的array必须有序
		int[] arr2 = new int[] { -98, -34, 2, 34, 54, 66, 79, 105, 210, 333 };

		int dest1 = -34;// 要找的数赋值，这里是要找-34这个数
		int head = 0;// 初始的首索引
		int end = arr2.length - 1;// 初始的尾索引
		boolean isFlag1 = true;

		while (head <= end) {

			int middle = (head + end) / 2;

			if (dest1 == arr2[middle]) {
				System.out.println("找到了指定元素，位置为：" + middle);
				isFlag1 = false;
				break;
			} else if (arr2[middle] > dest1) {
				end = middle - 1;
			} else {// arr2[middle] < dest1
				head = middle + 1;
			}
		}
		
		if(isFlag1){
			System.out.println("很遗憾，没有找到哦！");
		}
	}
}
