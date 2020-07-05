package com.oono.team.domain;

public class Designer extends Programmer{
	
	private double bonus;
	
	public Designer(){
		
	}
	public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus){
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}
	
	public double getBonus(){
		return bonus;
	}
	public void setBonus(double bonus){
		this.bonus = bonus;
	}
	
	//重写toString
	public String toString(){
		//super.super这种结构是不存在的，要被笑话的！
		//所以去Employee中把重复的结构封装成一个方法，子类都可以去继承调用即可
		return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t" 
		+ getEquipment().getDescription(); 
	}

}
