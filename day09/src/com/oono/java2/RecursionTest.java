package com.oono.java2;
/*
 * 递归方法的使用（了解）
 * 1.递归recursion：一个方法体内call本身
 * 2.方法递归包含了一种隐式的loop，它会重复执行某段代码，但这种重复执行无需loop控制
 * 
 * 
 */
public class RecursionTest {
	
	public static void main(String[] args) {
		
		//例1.计算1-100之间所有自然数的和
		//方式一：
//		int sum = 0;
//		for(int i = 0; i <= 100; i++){
//			sum += 1;
//		}
		//方式二：
		RecursionTest test = new RecursionTest();
		System.out.println(test.getSum(100));
		//例2.计算1-100之间所有自然数的乘积
		System.out.println(test.getProduct(3));
		
		//例3.已知一个数列：f(0) = 1, f(1) = 4, f(n+2) = 2 * f(n+1) + f(n);
		//其中n是大于0的int，求f(10)
		System.out.println(test.getNum(3));
		
		//例4.斐波那契数列
//		i.e 1 1 2 3 5 8 13 21 34 ...
		
		//例5.汉诺塔问题
		
		//例6.快排（每次pivot移到中间，比它小的在左边，比它大的在右边。然后再调自己）
		
		

	}
	
	public int getSum(int n){
		
		if(n == 1){
			n = 1;
		}else{
			n += getSum(n - 1);
		}
		
		return n;
		
	}
	
	public int getProduct(int n){
		
		if(n == 1){
			n *= 1;
		}else{
			n *= getProduct(n - 1);
		}
		
		return n;
	}
	
	public int getNum(int n){
		
		int result;
		
		if(n == 0){
			result = 1;
		}else if(n == 1){
			result = 4;
		}else{
			result = 2 * getNum(n - 1) + getNum(n - 2);
		}
		
		return result;
	}


}
