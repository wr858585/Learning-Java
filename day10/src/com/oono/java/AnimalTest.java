package com.oono.java;
/*
 * OOP的三大特质之一：封装Encapsulation
 * 
 * 
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.name = "大黄";
		a.age = 1;
//		a.legs = 4; //The field Animal.legs is not visible
		
		a.show();
		
//		a.legs = -4;
//		a.setLegs(6);
		a.show();
		
		
		
	}
}

class Animal{
	
	String name;
	int age;
	private int legs;
	
	public void setLegs(int l){
		if(l >= 0 && l % 2 == 0){
			legs = 1;
		}else{
			legs = 0;
//			option 2:抛出一个异常(later)
		}
	}
	
	public void eat(){
		System.out.println("动物进食");
	}
	
	public void show(){
		System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
	}
}