package com.oono.java1;

import java.sql.Date;

/*
 * Object类中toString()方法的使用：
 * 
 * 1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()方法
 * 		证明：点开println()方法的源码，发现有结构最后是调用了toString()方法的
 * 2. Object类中的toString()的定义
 * 		源码：
 * 	    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * 3. 像String, Date, File, 包装类等都重写了Object类中的toString()方法
 * 		使得在调用对象的toString()方法时，返回“实体内容”信息（每个类所需求的“实体内容”不尽相同）
 * 
 * 4. 自定义类也可以重写toString()方法，当调用此方法时，返回对象的“实体内容”
 * 
 * 
 */
public class ToStringTest {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom",21);
		System.out.println(cust1.toString());//com.oono.java1.Customer@15db9742 --> Customer[name = Tom, age = 21]
		System.out.println(cust1);//com.oono.java1.Customer@15db9742  --> Customer[name = Tom, age = 21]
		
		String str = new String("MM");
		System.out.println(str);//MM
		
		Date date = new Date(353624234L);
		System.out.println(date);//1970-01-05
		System.out.println(date.toString());//1970-01-05

	}
}

	