package com.oono.java;
/*
 * 抽象类的匿名子类：i.e 不仅对象可以造匿名对象，类也可以造匿名类
 * 
 * 
 */
public class PersonTest {

	public static void main(String[] args) {
		
		method(new Student());//匿名对象
		
		Worker worker = new Worker();
		method1(worker);//非匿名的类+非匿名的对象
		
		method1(new Worker());//非匿名的类+匿名对象
		
		System.out.println("****************");
		
		//匿名类+非匿名对象（没有造类，只造了对象p）
		Person p = new Person(){

			@Override
			public void ate() {
				// TODO Auto-generated method stub
				System.out.println("吃东西");
			}

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("好好呼吸");
			}
			
		};
		
		method1(p);
		System.out.println("********************");
		//匿名类+匿名对象（最懒的写法）
		method1(new Person(){
			
			public void ate(){
				System.out.println("吃好吃的东西");
			}
			public void breath(){
				System.out.println("好好呼吸新鲜空气");
			}
		});
		
	}
	
	public static void method1(Person p){
		p.ate();
		p.breath();
	}
	
	public static void method(Student s){
		
	}
	
}

class Worker extends Person{

	@Override
	public void ate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}