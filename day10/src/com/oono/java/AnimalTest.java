package com.oono.java;
/*
 * OOP的三大特质之一：封装Encapsulation(不同于python，Java是硬封装)
 * 
 * 一、intro
 * 当我们创建一个类的对象后，可以通过 对象.属性 的方式进行赋值操作，但是要数类一致
 * 但是实际开发中，我们往往需要对assigned value进行一定的限制（如：不能是负数）
 * 		但是这个需求，往往在声明处无法实现（需求比较复杂，declaration只能简单规定数类等）
 * 		所以需要单独构造一个method来实现，如setLegs()
 * 同时，给field加上access modifier/specifier，以避免user直接通过obj.field的方式更改
 * 此时，用private关闭field的直接call，但构造一个方法来提供一个修改的接口
 * 		这就是Encapsulation的体现
 * 
 * 二、封装性的体现
 * 将xxx属性私有化声明private，同时提供getXxx和setXxx来获取和设置属性值
 * 
 * 三、Access modifier/specifier in java
 * 1.Java规定的权限修饰符，从小到大依次是：private, 缺省, protected, public
 * 2.access modifier可以修饰的东西是：field, method, constructor, 内部类
 * 		注意：不能修饰代码块
 * 3.如果修饰的是class，那么只能是缺省或者public(否则没有意义)
 * 
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.name = "大黄";
		a.age = 1;
//		a.legs = 4; //The field Animal.legs is not visible 即：私有属性
		
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
	
	public int getLegs(){
		return legs;
	}
	
	public void eat(){
		System.out.println("动物进食");
	}
	
	public void show(){
		System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
	}
}