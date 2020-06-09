package com.oono.exer3;

public class Customer {
	
	//field
	private String firstName;
	private String lastName;
	private Account account;//我们自己定义的类Account，也可以有其对应的属性（理解：同String类）
	//再捋一下：类比声明int/double etc 类的field
	
	//constructor
	public Customer(String f, String l){
		this.firstName = f;
		this.lastName = l;
	}
	
	//method
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setAccount(Account account){
		this.account = account;
	}
	public Account getAccount(){
		return account;
	}
}
