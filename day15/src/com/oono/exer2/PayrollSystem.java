package com.oono.exer2;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素，输出各个对象的类型，name，number，birthday
 * 当键盘输入本月月份分值时，如果本月是某个Employee对象的生日，还要输出增加工资信息
 * 
 */
public class PayrollSystem {

	public static void main(String[] args){
		
		//方式一：
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入当月的月份：");
//		int month = scanner.nextInt();
		
		//方式二：Calendar常用类，之后会讲到
		Calendar calendar = Calendar.getInstance();//不懂可以看文档，是获取当前的日期
		int month = calendar.get(Calendar.MONTH);//获取当前日期的“月份”（Java从0开始，看文档）
		System.out.println(month);//一月份：0
		
		Employee[] emps = new Employee[2];//Employee是抽象类不能new，为什么这里没有报错？
		//因为此时内存中，stack加载了变量emps，指向了heap中一个长度为2的Employee类型的数组
		//但此时数组只是声明了元素的类型为Employee抽象类，但全部为null，并没有new Employee对象，所以不报错
		
		emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 2, 28), 10000);
		emps[1] = new HourlyEmployee("潘雨生", 2001, new MyDate(1991, 6, 6), 50, 240);
		
		for(int i = 0; i< emps.length; i ++){
			System.out.println(emps[i]);//打印emps[i]这个obj，源码会调用toString，则调用到我们重写的toString方法，返回Customized的内容
			double salary = emps[i].earnings();
			System.out.println("月工资为：" + salary);
			
			if((month + 1) == emps[i].getBirthday().getMonth()){
				System.out.println("生日快乐！奖励100元");
			}
			
		}
		
		
	}
}
