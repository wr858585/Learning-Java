package com.oono.exer;
/*
 * array涉及的algorithm考察点三：a.数组的复制
 * 使用简单array
 * 1>创建一个名为ArrayExer2的类，在main()方法中声明array1和array2两个var，为int[]类
 * 2>使用{}，初始化array1为8个素数：2,3,5,7,11,13,17,19
 * 3>显示array1的内容
 * 4>赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
 * e.g. array[0]=0, array[2]=2
 * 
 * 思考：array1和array2是什么关系？->两者地址相同，均指向堆空间的一个obj
 * 拓展：修改题目，实现array2对array1的复制
 */
public class ArrayExer3 {
	public static void main(String[] args) {
		int[] array1, array2;
		
		array1 = new int[]{2,3,5,7,11,13,17,19};
		
		//显示array1的内容
		for(int i = 0; i < array1.length; i++){
			System.out.print(array1[i] + "\t");
		}
		
		//赋值array2变量等于array1
		//这并不能称作数组的复制/copy
//		array2 = array1;
//		正解：
		array2 = new int[array1.length];
		for(int i = 0; i < array1.length; i++){
			array2[i] = array1[i];
		}
		
		//修改array2中的偶索引元素，使其等于索引值
		for(int i = 0; i < array2.length; i++){
			if(i % 2 == 0){
				array2[i] = i;
			}
		}
		System.out.println();
		
		//再次print array1，会有变化！
		for(int i = 0; i < array1.length; i++){
			System.out.print(array1[i] + "\t");
		}
		
//		run result:
//		2	3	5	7	11	13	17	19	
//		0	3	2	7	4	13	6	19	
//		因为这是直接更改了{2,3,...,19}这个object，而非把array2的箭头改变而已
//		测验:
		int a = 10;
		int b = a;
		b = 20;
		System.out.println();
		System.out.println("a = " + a + " b = " + b);
		//a = 10 b = 20
		//可见b未改变a，因为a指向的10这个object没有被改变，不是b[0] = xx这个会改变a指向的obj
	}
}
