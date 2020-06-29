package com.oono.java2;
/*
 * 
 * 
 * 
 */
public class InnerClassTest1 {

	//开发中很少见
	public void method(){
		class AA{
			
		}
	}
	
	//更常用的内部类场景:Comparable接口会用到
	//具体来说，要返回一个实现了Comparable接口的类的对象
	public Comparable getComparable(){
		
		//创建一个实现了Comparable接口的类：局部内部类
		//方式一：比较标准的方式（非匿名）
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		}
//		return new MyComparable();
		
		//方式二：匿名的方式
		return new Comparable(){

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		
		
	}
	
	
	
	
}
