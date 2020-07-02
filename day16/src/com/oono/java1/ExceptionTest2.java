package com.oono.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 异常处理的方式二：throws + 异常类型
 * 
 * 1. "throws + 异常类型"卸载方法的声明处。指明此方法执行时，可能会抛出的异常类型
 * 		一旦当方法体执行时，出现异常，仍会在异常代码处生成一个对应异常类的对象
 * 		此对象满足throws后异常类型时，就会被抛出
 * 		异常抛出后，之后的代码不会被执行unapproachable
 * 
 * 2. 体会：try-catch-finally:真正的将异常处理掉了
 * 			throws：只是将异常抛给了方法的调用者。并没有真正的把异常处理掉
 * 
 * 3. 开发中如何选择try-catch还是throws？
 * 		3.1 如果父类中被重写的方法，没有throws方式处理异常，则子类重写的方法也不能使用throw
 * 			i.e 如果子类重写的方法中有异常，则必须使用try-catch方式来处理
 * 			（多线程中，父类run方法没有异常，子类重写run就有，则只能用try-catch来处理）
 * 		3.2 执行的方法a中，如果先后调用了另外几个方法，这几个方法是递进关系执行的。
 * 			则我们建议这几个先使用throw的方式处理，全部throw给方法a，给try-catch进行统一处理
 * 			好处：方便简洁，更重要的是 --> 如果一开始就try-catch，往下走进入递进的第二个方法，不会有意义。因为传入的东西也是不对的
 * 
 */
public class ExceptionTest2 {
	
	public static void main(String[] args) {
		
		
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void method2() throws IOException{
		method1();
	}
	

	public static void method1() throws FileNotFoundException, IOException{
		
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1){
			System.out.println((char)data);
			data = fis.read();
		}
		
		fis.close();
		
	}
	
}
