package com.oono.exer;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acct1 = new Account("123", 143.2);
		Account acct2 = new Account("234", 998);
		Account acct3 = new Account("ebadk391@xc", 23.3);
		
		Account.setInterestRate(0.012);
		Account.setMinBalance(100);
		
//		acct1.show();
//		acct2.show();
//		acct3.show();
		
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);//均省略了.toString,因为我们说println源码就是调用了toString的
		
		System.out.println(Account.getInterestRate());
		System.out.println(acct1.getMinBalance());//左边会有提示，告诉我们从Account类调用更好，因为是静态方法
		//The static method getMinBalance() from the type Account should be accessed in a static way
		//但是line22-23都不会编译报错（无论从类调用，还是从实例调用，静态属性/方法不会变），只是更推荐严谨的从类调
		
	}
}
