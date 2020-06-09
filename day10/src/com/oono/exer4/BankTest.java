package com.oono.exer4;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.addCustomer("Jane", "Smith");
		
		//连续操作，注意理解逻辑
		
		bank.getCustomer(0).setAccount(new Account(2000));//anonymous func
		//思路：银行 -> 客户 -> 账户 -> 初始化余额
		
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);
		
		System.out.println("****************************");
		
		bank.addCustomer("万里", "杨");
		
		System.out.println("银行客户的个数为：" + bank.getNumOfCustomers());
		
	}
}
