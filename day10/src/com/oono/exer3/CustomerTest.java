package com.oono.exer3;

/*
 * 写一个测试程序
 * （1）创建一个Customer，名字叫Jane Smith, 
 * 		他有一个账号为1000，余额为2000元，年利率为1.23%的账户
 * （2）测试活动：存入100元，取出960元，取出2000元
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane", "Smith");

		Account acct = new Account(1000, 2000, 0.0123);

		cust.setAccount(acct);// 让新建的account和Account类连上。理解不好：画内存图！
		// 实际上这就是一个双指针

		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		// equivalent to:
		// acct.deposit(100);
		// acct.withdraw(960);
		// acct.withdraw(2000);

		System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() + "] has an account: id is "
				+ cust.getAccount().getId() + ", annualInterestRate is " + cust.getAccount().getAnnualInterestRate()
				+ ", balance is " + cust.getAccount().getBalance());
	}
}
