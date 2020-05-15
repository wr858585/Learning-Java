package com.oono.java1;
/*
 * 可变个数形参的方法
 * 
 * 1.jdk 5.0新加的功能
 * 2.具体使用：
 * 		2.1格式：数类 ... 参数名/var名
 * 		2.2当call可变个数形参的method时，传入的arg个数可以为0，1，2...都行
 * 		2.3可变个数形参的method，可以与与之重载的method共存
 * 			i.e认为下面的方法2，方法3的形参列表其实是不同的（相同的话不能overload了！）
 * 		2.4可变个数形参的method，不可以与同样的形参（但是为数组）构成overload
 * 			如下面的方法4，与方法3不能共存
 * 			因为JKD5.0以前就是用方法4来写不定长形参的，JDK5.0以后用方法3代替了，默认实质一样
 * 		2.5可变个数形参，必须声明在方法形参列表中的末尾
 * 			i.e (int i, String ... strs)是可以的
 * 				(String ... strs, int t)是不行的，与py的*号不同，可以放很多位置更灵活
 * 				否则异常：The variable argument type String of the method show must be the last parameter
 * 				mechanism：否则不知道第一个不定长的参数到底有几个，什么时候end，是int t了 when compiling
 * 		2.6Varargs只能在同一个method中设置一个
 * 
 */
public class MethodArgsTest {
	
	public static void main(String[] args) {
		
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello"); //优先对应第二个方法，因为精准对应。如果没有第二个，会对应第三个方法
		test.show("hello", "world", "!"); //对应第三个方法
		test.show();//也对应第三个
		test.show(new String[]{"aa","bb","cc"});//以前没有Varargs机制时候的call方法四的办法
		test.show("aa","bb","cc");//现在可以直接用Varargs机制call方法三
	}
	
	public void show(int i){
		
	}
	
	public void show(String s){
		
	}
	
	public void show(String ...strings){
		
	}
	
//	public void show(String[] strs){
//		
//	}
}
