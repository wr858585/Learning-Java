package com.oono.exer;
/*
 * 编写一个类实现银行账户的概念，包含的属性有“账号”，“密码”，“存款余额”，“利率”，“最小余额”
 * 定义封装这些属性的方法。账号要自动生成
 * 		编写主类，使用银行账户类，输入、输出3个储户的上述信息
 * 		考虑：哪些属性可以设计成static
 * 
 */
public class Account {

	private int id;
	private String password = "000000";//初始密码，在声明处显式赋值即可
	private double balance;
	
	private static double interestRate;
	private static double minBalance = 1.0;//规定最小金额，也显式声明即可
	private static int init = 1001;//用于自动生成id使用的
	
	public Account(){
		id = init++;
	}
	public Account(String password, double balance){
		this();
		this.password = password;
		this.balance = balance;
	}
	
	public int getId(){
		return id;
	}
//	public void setId(int id){
//		this.id = id;
//	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public double getBalance(){
		return balance;
	}
//	public void setBalance(double balance){
//		this.balance = balance;
//	}
	public static double getInterestRate(){
		return interestRate;
	}
	public static void setInterestRate(double interestRate){
		Account.interestRate = interestRate;//注意，不是this.interestRate,静态的方法一定不会有this，super，跟当前对象有关的东西，一旦有马上报错
	}
	public static double getMinBalance(){
		return minBalance;
	}
	public static void setMinBalance(double minBalance){
		Account.minBalance = minBalance;
	}
	
//	public void show(){
//		System.out.println("储户id：" + this.getId() + ", 密码：" + this.getPassword() + ", 存款余额：" + this.getBalance());
//	}
	
	//可以不用自己写输出语句了，source自动生成toString()!
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}
	
}
