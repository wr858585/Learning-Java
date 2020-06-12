package com.oono.exer;

/*
 * 定义一个Mankind类，包括：
 * 		成员变量：int sex 和 int salary
 * 		方法：void manOrWoman():根据sex的值显示"man"(sex == 1) or "woman"(sex == 2);
 * 		方法：void employed():根据salary的值显示"no job"(salary == 0) or "job"(salary != 0);
 * 
 * 
 * 
 * 
 */
public class Mankind {

	private int sex;// 性别
	private int salary;// 薪资

	public Mankind(){
		
	}
	
	public Mankind(int sex, int salary){
		this.sex = sex;
		this.salary = salary;
	}
	
	
	public void manOrWoman() {
		if (sex == 1) {
			System.out.println("man");
		} else if (sex == 0) {
			System.out.println("woman");
		}
	}

	public void employed() {
		// 这种简单的逻辑可以用三元运算符，更简洁
		String jobInfo = (salary == 0) ? "no job" : "job";
		System.out.println(jobInfo);
	}

	public void setSex(int sex){
		this.sex = sex;	
	}
	
	public int getSex(){
		return sex;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public int getSalary(){
		return salary;
	}
	
	
	
	
	
}
