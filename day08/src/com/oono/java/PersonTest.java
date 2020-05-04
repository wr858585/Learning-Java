package com.oono.java;
/*
 * 一、设计类：其实就是设计类的成员
 * 
 * 属性=成员变量=field=域、字段
 * 方法=成员方法=函数=method
 * 
 * 创建类的对象=类的实例化=实例化类
 * 
 * 二、类和对象的使用（OOP思想的落地实现）
 * 1.创建类Class，设计类的成员
 * 2.创建类的对象Obj/Instance
 * 3.调用对象的结构field/method
 * 
 * 三、如果创建了一个类的多个obj，则每个obj都独立的拥有一套类的field。（非static的）
 * i.e 若修改一个obj的field值，不会影响其他obj的field值
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		//创建Person类的对象
		Person p1 = new Person();
		//类比scanner类的实例化
		//Scanner scanner = new Scanner(System.in);
		
		//调用对象的结构：属性、方法
		//call field的格式：对象.属性
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);//Tom
		
		//调用方法：对象.方法
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		//*************************
		Person p2 = new Person();
		System.out.println(p2.name);//null
		System.out.println(p2.isMale);//false
		//*************************
		//把p1变量保存的obj address赋给p3，导致p1和p3指向了堆空间heap中的同一个obj实体
		Person p3 = p1;
		System.out.println(p3.name);//Tom
		
		p3.age = 10;
		System.out.println(p1.age);//1
		
		
		
	}
}

class Person{
	
	//属性
	String name;
	int age = 1;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("人可以吃饭");
	}
	public void sleep(){
		System.out.println("人可以睡觉");
	}
	public void talk(String language){
		System.out.println("人可以说话，使用的是：" + language);
	}
}