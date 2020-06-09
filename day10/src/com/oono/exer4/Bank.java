package com.oono.exer4;

public class Bank {
	
	//field
	private Customer[] customers;//银行的customers必须是数组，才能存放多个客户
	private int numberOfCustomers;//客户的人数。
//	注意：customers数组的长度不等于客户的人数，前者是容量，可能为10，后者为2，剩下的为empty slots
	
	//constructor
	public Bank(){
		customers = new Customer[10];//初始化也可以显式地写在field声明中，写在一起
	}
		
	//method
	public void addCustomer(String f, String l){
		Customer cust = new Customer(f, l);
		customers[numberOfCustomers] = cust;
		numberOfCustomers ++;
		//也可以合并成一行代码 customers[numberOfCustomers ++] = cust;
	}
	
	public int getNumOfCustomers(){
		return numberOfCustomers;
	}

	//获取指定位置的客户
	public Customer getCustomer(int index){
//		return customers[index];这种写法不严密：可能index大于length越界；可能index大于客户数
		if(index >= 0 && index < numberOfCustomers){
			return customers[index];
		}
		
		return null;//或者抛异常也行
	}
	
}
