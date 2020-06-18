package com.oono.exer2;

public class MyDateTest {

	public static void main(String[] args){
		MyDate m1 = new MyDate(14,3,1976);
		MyDate m2 = new MyDate(14,3,1976);
		if(m1 == m2){
			System.out.println("m1==m2");
		}else{
			System.out.println("m1!=m2");
		}
		
		if(m1.equals(m2)){
			System.out.println("m1 is equal to m2");
		}else{
			System.out.println("m1 is not equal to m2");
		}
	}
}

class MyDate{
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	
	public boolean equals(Object obj){
		
		if(this == obj){
			return true;
		}
		
		if(obj instanceof MyDate){
			MyDate myDate = (MyDate) obj;
			return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
			//为什么有line59的强转，因为obj无法直接调用MyDate的结构
		}
		return false;
		
	}
	
	
}