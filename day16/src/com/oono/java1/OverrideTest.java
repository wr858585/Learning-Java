package com.oono.java1;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 方法重写的规则之一：
 * Recap：子类重写的方法抛出的异常类型 不大于 父类被重写的方法抛出的异常类型
 * 		解释为什么是这样，可以用throws来看一下
 * 
 */
public class OverrideTest {

	public static void main(String[] args) {
		OverrideTest test = new OverrideTest();
		test.display(new Subclass());
		
	}
	
	public void display(SuperClass s){
		try {
			s.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//多态，实际上调用的是子类Subclass中重写的method()方法
	}
	
}

class SuperClass{
	
	public void method() throws IOException{
		
	}
}

class Subclass extends SuperClass{
	
	public void method() throws FileNotFoundException{//为IOException的子类，可以throw
		//甚至IOException也可以，只要不大于。如果throw是的是Exception类的异常，则line23覆盖不了
		//因为line23是针对method这个虚方法的try-catch，即父类方法的throw的异常类型不能小于子类throw的
		
	}
}