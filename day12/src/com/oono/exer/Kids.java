package com.oono.exer;
/*
 * 定义类Kids继承Mankind，并包括
 * 		成员变量：int yearsOld；
 * 		方法：printAge()打印yearsOld的值。
 * 
 * 
 * 
 * 
 */
public class Kids extends Mankind{
	
	private int yearsOld;
	
	public Kids(){
		
	}
	
	public Kids(int yearsOld){
		this.yearsOld = yearsOld;
	}
	
	public void printAge(){
		System.out.println("I am " + yearsOld + " years old.");
	}
	
	public void setYearsOld(int yearsOld){
		this.yearsOld = yearsOld;
	}
	
	public int getYearsOld(){
		return yearsOld;
	}
	
	
	
	
	
}
