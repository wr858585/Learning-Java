package com.oono.exer4;

public class Customer {
	
	//field
	private String firstName;
	private String lastName;
	private Account account;
	
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
	public Account getAccount(){
		return account;
	}
	public void setAccount(Account account){
		this.account = account;
	}
	
}
