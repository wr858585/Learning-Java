package com.oono.exer3;

public class Account {
	
	//field
	private int id;//账号
	private double balance;//余额
	private double annualInterestRate;//利率
	
	//constructor
	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	//method
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	//设置提款方法withdraw，且先判断user的balance是否满足提款数额的要求，不能的话给予提示
	public void withdraw(double amount){
		if(balance < amount){
			System.out.println("余额不足，提款失败");
			return;
		}
		balance -= amount;
		System.out.println("成功取出：" + amount);
	}
	
	public void deposit(double amount){
		if(amount > 0){
			balance += amount;
			System.out.println("成功存入：" + amount);
		}
	}
	
}
