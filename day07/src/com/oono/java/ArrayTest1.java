package com.oono.java;

/*
 * array涉及的algorithm的考察点二：min/max/average/sum
 * 
 * 题目：定义一个int类的一维数组，包含10个元素，分别赴一些随机整数
 * 然后求所有ele的max/min/average/sum并输出
 * 要求：所有随机数都是两位数
 * 
 * 公式1：math.random()会生成一个随机float
 * 公式2：(int)(math.random() * (b - a + 1) + a)会生成一个属于[a,b]的随机整数
 * 所以 (int)(math.random()*(99-10+1)+10)可以生成一个属于[10,99]的随机整数
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			// arr[i] = int(Math.random() * 100 + 10);这种写法是不对的，是python的写法
			// java的强转是()作为强转符号
			arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
		}

		// 遍历一下
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 求max
		int maxValue = arr[0];// 比写0好，因为如果全是负数，则body中的if恒为false
		for (int i = 0; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		System.out.println("最大值为：" + maxValue);

		// 求min
		int minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		System.out.println("最小值为：" + minValue);

		// 求sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("总和为：" + sum);
		// 求average
		int avgValue = sum / arr.length;
		System.out.println("平均值为：" + avgValue);
	}
}
