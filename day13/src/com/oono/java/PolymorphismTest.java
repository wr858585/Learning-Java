package com.oono.java;
/*
 * 面试题：多态性是编译时行为，还是运行时行为？证明。
 */
import java.util.Random;

public class PolymorphismTest {
	
	public static void main(String[] args) {
		
		//生成一个0，1，2中的任意一个随机数
		int key = new Random().nextInt(3);

		//打印这个随机数
		System.out.println(key);
		
		//new对象的过程又方法完成，通过key实现随机new狗/猫/羊（编译时，不知道是哪个类）
		//而左边声明Animal类，则很好的体现了多态性。
		//因为不知道会new什么，但是不写new出来的类，写他们的父类也可以运行时执行子类中重写的方法（多态性最典型的体现）
		Animal animal = getInstance(key);
		
		//用实例调用虚拟函数eat，通过多态性揭示创建的是哪个实例对象（运行时，才知道是哪个类）
		animal.eat();
	}
	
	public static Animal getInstance(int key){
		switch(key){
		case 0:
			return new Cat();
		case 1:
			return new Dog();
		default:
			return new Sheep();
		}
	}
}

class Animal{
	
	public void eat(){
		System.out.println("Animals eat food.");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("Dogs chew bones.");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("Cats eat fish.");
	}
}

class Sheep extends Animal{
	public void eat(){
		System.out.println("Sheep eat grass.");
	}
}
