package com.oono.java2;
/*
 * 如何自定义异常类？
 * 1. 继承于现有的异常结构：RuntimeException, Exception
 * 2. 提供全局常量(static final)：serialVersionUID，是类的一个标识/序列号，用来证明是同一个类（之后讲I/O流再说）
 * 		相当于说确定一个类是同一个类：不是通过类名，而是通过序列号（IO流中本地和网络传输，是否为同一个类时需要用到）
 * 3. 提供重载的构造器
 * 
 * 
 */
public class MyException extends Exception{
	
	static final long serialVersionUID = -7123214153412939L;
	
	public MyException(){
		
	}
	
	public MyException(String msg){
		super(msg);//父类为Exception,其带message的构造器已经写过this.xxx = xxx;了
	}
	
	

}
