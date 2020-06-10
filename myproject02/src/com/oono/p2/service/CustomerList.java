package com.oono.p2.service;

import com.oono.p2.bean.Customer;

/**
 * @description CustomerList为Customer对象的管理模块，
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，
 * 供CustomerView调用
 * @author oono
 *
 */
public class CustomerList {

	//field
	private Customer[] customers;//用来保存客户对象的数组
	private int total = 0; //记录已保存客户对象的数量，写不写0都一样默认值就是它
	
	//constructor
	/**
	 * @description 用来初始化customers数组的构造器
	 * @param totalCustomer：指定数组的长度/设置数组存储个数的最大时/最多多少customers
	 */
	public CustomerList(int totalCustomer){
		//先要对数组进行初始化，不然直接new Customer的实例对象会空指针
		customers = new Customer[totalCustomer];
		this.total = totalCustomer;//用来指定数组的最大空间/长度
		
	}
	
	
	
}
