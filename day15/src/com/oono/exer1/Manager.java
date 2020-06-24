package com.oono.exer1;
/*
 * 对于Manager类来说，他既是员工，还具有奖金bonus属性
 */
public class Manager extends Employee{

	private double bonus;
	
	public Manager(double bonus){
//		super(name, id, salary);这是不对的，这样写相当于调用了父类带这三个形参的构造器，
//		即引入了this.name=name;this.id=id;this.salary=salary;
//		这三行代码，那你这里又只有一个形参，报错
		this.bonus = bonus;
	}
	public Manager(String name, int id, double salary, double bonus){
		super(name, id, salary);//相当于调用父类的带这三个形参的构造器后，省了那三行代码（复用了父类中构造器的代码）
		this.bonus = bonus;
	}
	
	public void work(){
		System.out.println("管理员工，提高公司运行的效率");
	}
	
}
