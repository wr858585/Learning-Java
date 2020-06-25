package com.oono.exer2;
/*
 * MyDate类包含：
 * private成员变量year，month，day；
 * toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
 * 
 */
public class MyDate {

	private int year, month, day;
	
	public MyDate(int year, int month, int day){
		//super();如果不明确写出继承关系（继承哪一个父类的构造器），则默认是继承super()，系统会自己添上
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		this.day = day;
	}
	
	public String toDateString(){
		return year + "年" + month + "月" + day + "日";
	}
	
}
