package com.oono.java;
/*
 * abstract使用上的注意点：
 * 1. abstract不能用来修饰：属性、构造器等结构
 * 2. abstract不能用来修饰私有方法（因为父类中private的方法，是无法被子类重写的。讲过，权限太小）
 * 			    不能用来修饰静态方法（之前提到：非static的方法才考虑重写，static的方法一定不是重写）
 * 					因为static方法在类加载的时候就会run，那么abstract方法没有方法体，马上出错，一定会运行
 * 		            不能用来修饰final方法（因为final修饰方法就表示，不能被重写的方法！）
 * 			    不能用来修饰final类
 * 					因为final类表示该类不能被继承，而abstract类如果没有子类，它自己又不能造对象进行实例化，则这个abstract就没有任何意义）
 * 				所以：final和abstract是一定无法共存的，针尖对麦芒
 * 
 */
public class AbstractTest1 {

}
