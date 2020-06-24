package com.oono.java2;

import org.junit.Test;

/*
 * 包装类的使用：
 * 1. java提供了8中基本数类对应的包装类，使得基本数类的变量具有类的特征
 * 
 * 2. 需要掌握：基本数类、包装类、String类三者之间的相互转换（每组关系掌握最简单的一种即可）
 * 		① 基本数类 <---> 包装类：自动装包/自动拆包
 * 		② 基本数类+包装类 ---> String类：调用String.valueOf(数类 value);
 * 		③ String类 ---> 基本数类+包装类：调用包装类.parseXxx(String str); 其中Xxx为某个数据类型 
 * 
 */
public class WrapperTest {
	
	//String类 ---> 基本数类+包装类：调用包装类的parseXxx()方法
	@Test
	public void test5(){
		String str1 = "123";//同理，"123abc"就会报NumberFormatException
//		int num1 = (int)str1;是错的
//		Integer int1 = (Integer)str1;
		//为什么上面两个强转是不对的：因为强转必须是要有子父类关系的才能强转！记住这个就好理解多了
		//而Integer int = new Integer("123");不涉及强转，所以可以！而且不是"123abc"这种不是数的东西
		
		int num2 = Integer.parseInt(str1);
		System.out.println(num2 + 1);//124
		
		String str2 = "true";//同理，"true1"也不会报错，但会返回false
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);//true
		
		
		
	}
	
	
	//基本数类+包装类 ---> String类：调用String重载的valueOf(数类 value)方法，或者做连接运算
	@Test
	public void test4(){
		
		int num1 = 10;
		//方式一：做连接运算
		String str1 = num1 + "";
		//方式二：调用String的valueOf(数类 value)方法，把基本数类/包装类转换为字符串
		float f1 = 12.3f;//不写f的话是12.3是double
		String str2 = String.valueOf(f1);//"12.3"
		System.out.println(str2);
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str3);//"12.4"
		
		
	}
	
	
	
	
	/*
	 * JDK 5.0新特性：自动装箱与自动拆箱
	 */
	@Test
	public void test3(){
		
//		int num1 = 10;
//		//把10这个基本数类要转化为Integer类的实例，才能作为实参传入method()方法
//		method()
		
		//自动装箱：基本数类 ---> 包装类
		int num2 = 10;
		Integer int1 = num2;//自动装箱
		Integer num10 = 11;//自动装箱
		
		boolean b1 = true;
		Boolean b2 = b1;//自动装箱
		
		//自动拆箱：包装类 ---> 基本数类
		System.out.println(int1.toString());
		
		int num3 = int1;//自动拆箱
		
		//这个自动装箱&自动拆箱最方便的就是：不用再调用构造器去转换基本数类和引用数类了
		
	}
	
	public void method(Object obj){
		
	}
	
	//包装类 ---> 基本数类：调用包装类的xxxValue
	//intuition:做基本运算如+-*/
	@Test
	public void test2(){
		Integer int1 = new Integer(12);
		
		int i1 = int1.intValue();
		System.out.println(i1 + 1);//13
		
		Float flt1 = new Float(12.3);
		float f1 = flt1.floatValue();
		System.out.println(f1 + 1);//13.3
		
	}
	

	//基本数类 ---> 包装类：调用包装类的构造器
	//intuition：调Object类中的结构，以及其他类的实例才具有的功能（面向对象编程）
	@Test
	public void test1(){
		
		//option1：调Integer/Short/Byte/Long/Double/Float(int/short/byte... value)构造器，传的是数
		int num1 = 10;
		Integer int1 = new Integer(num1);//或者直接new Integer(10)
		System.out.println(int1.toString());//可以调Object类中的方法了
		
		//option2：调Integer/Short/Byte/Long/Double/Float(String s)构造器，传的是String
		Integer int2 = new Integer("123");
		System.out.println(int2.toString());
		
//		Integer int3 = new Integer("123abc");//这里不对，因为123abc不是一个纯粹的数了，怎么能是Integer类呢
//		System.out.println(int3.toString());//NumberFormatException
		
		Float f1 = new Float(12.3);
		Float f2 = new Float(12.3f);
		Float f3 = new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("trUE");
		Boolean b3 = new Boolean("true123");
		System.out.println(b1);//true
		System.out.println(b2);//true,源码中优化了大小写，只要是true四个字母这样，都返回true
		System.out.println(b3);//false,而不是报错NumberFormatException，也是源码的写法造成的
		
		Order order = new Order();
		System.out.println(order.isMale);//false,因为java的布尔默认值是false！和py不一样
		System.out.println(order.isFemale);//null，因为数类是包装类Boolean而不是基本类boolean了，默认值为null（引用数类）
		
		
		
	}
	
}

class Order{
	
	boolean isMale;
	Boolean isFemale;
}