package com.oono.java3;
/*
 * final:最终的
 * 
 * 1. final可以用来修饰的结构：类、方法、变量
 * 
 * 2. final用来修饰一个类：此类不能被其他类所继承了（即是说无法去扩充功能了，开发者认为功能已经完善了）
 * 			比如：String类、System类、StringBuffer类
 * 
 * 3. final用来修饰一个方法：这个方法不能被重写了（也就是说这个方法也就这样了，重写不会有什么新花样的）
 * 			比如：Object类中getClass()
 * 
 * 4. final用来修饰变量：此时的变量就不能再变了，即变成了常量
 * 		4.1 final修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
 * 			既然是常量，则必须赋值，不能只声明。否则报错：The blank final field xxx may not have been initialized.
 * 		4.2 final修饰局部变量：
 * 				尤其使用final修饰形参时，表明形参是一个常数。当我们调用词方法时，给常量形参赋值一个形参。
 * 				一旦赋值以后，它就恒等于这个实参，不能重新赋值。（常量嘛）
 * 
 * 5. static final 合起来用：修饰属性 --> 叫全局常量（接口当中都是全局常量）
 * 							修饰方法 --> 一个不能重写的全局方法（我们开发中很少用，不会说final写死一个方法不让重写）
 */

public class FinalTest {

	final int WIDTH = 10;//显式初始化常量
	final int LEFT;
	final int RIGHT;
//	final int DOWN;
	
	{
		LEFT = 1;//代码块中初始化常量
	}
	
	public FinalTest(){
		RIGHT = 2;
	}
	
	public FinalTest(int n){
		RIGHT = n;//如果构造器有多个，则都要赋值，不能出现可能使final属性没有值的情况
	}
	
//	public void setDown(int down){ 不能在方法中去给常量初始化，因为太晚了，构造器是最后的时机。否则类的对象都创建好了，final的值还没有确定，是不行的。
//		this.DOWN = down;
//	}
	
	
	public void doWidth(){
//		width = 20; The final field FinalTest.width cannot be assigned
	}
	
	public void show(){
		final int NUM = 10;//常量
//		NUM += 20;
	}
	
	public void show(final int NUM){
//		num = 20;编译不通过，因为形参在传入实参时候，相当于赋值了，常量赋值后就不能更改
		System.out.println(NUM);
	}
	
	public static void main(String[] args) {
		int num = 10;
		num = num + 5;
		
		FinalTest test = new FinalTest();
		test.show(10);
		
	}
	
}

final class FinalA{
	
}

//class B extends FinalA{
//	The type B cannot subclass the final class FinalA
//}
//
//class C extends String{
//	The type C cannot subclass the final class String
//}

//class AA{
//	public final void show(){
//		
//	}
//}
//
//class BB extends AA{
//	public void show(){
////		Cannot override the final method from AA
//	}
//}