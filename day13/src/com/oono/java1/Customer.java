package com.oono.java1;

public class Customer {

	private String name;
	private int age;
	
	public Customer(){
		
	}
	public Customer(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	//重写的原则：比较两个对象的实体内容（每个类都可以自己定义需求，比如这个类希望比较两个对象的name和age是否相同）
	@Override
	public boolean equals(Object obj){
		if(this == obj){
		return true;
		}
		
		if(obj instanceof Customer){
			Customer cust = (Customer) obj;
			//比较两个对象的每个属性是否都相同
			
			//繁琐的写法：
//			if(this.age == cust.age && this.name.equals(cust.name)){
//				return true;
//			}else{
//				return false;
//			}
			
			//简洁的：
//			if(this.age == cust.age && this.name.equals(cust.name))){
//				return true;
//			}
			
			//更简洁的：
			return this.age == cust.age && this.name.equals(cust.name);
		}
		
		return false;
	}
	
	
	
}
