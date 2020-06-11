package com.oono.p2.service;

import com.oono.p2.bean.Customer;

/**
 * @description CustomerList为Customer对象的管理模块，
 *              内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法， 供CustomerView调用
 * @author oono
 *
 */
public class CustomerList {

	// field
	private Customer[] customers;// 用来保存客户对象的数组
	private int total = 0; // 记录已保存客户对象的数量，写不写0都一样默认值就是它

	// constructor
	/**
	 * @description 用来初始化customers数组的构造器
	 * @param totalCustomer：指定数组的长度/设置数组存储个数的最大时/最多多少customers
	 */
	public CustomerList(int totalCustomer) {
		// 先要对数组进行初始化，不然直接new Customer的实例对象会空指针
		customers = new Customer[totalCustomer];// 初始化数组的最大空间/长度
		// totalCustomer不是total属性，前者是数组的最大容量/长度，后者是实际的银行客户人数
	}

	/**
	 * @description 将指定的客户添加到数组中
	 * @param customer
	 * @return true:添加成功 false:添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if (total >= customers.length) {
			return false;
			// 不用再死板地写一个return来结束当前的方法，因为上一行已经return了something，不会执行下面的代码了
		}

		// customers[total] = customer;
		// //这样了就实现了当前要加入的customer实例对象add进customers这个变量（这个变量是Customer类的数组）
		// total++;
		// 或者两行变一行
		customers[total++] = customer;
		return true;// 因为该方法是有返回值的，所以每一种可能的语句都要有返回值
	}

	/**
	 * @description 修改指定索引位置的客户信息
	 * @param index
	 * @param cust
	 * @return true:修改成功 false:修改失败
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index >= 0 && index < total) {// 不是小于等于customers.length，因为可能是empty
											// slots
			customers[index] = cust;
			return true;
		}
		return false;
	}

	/**
	 * @description 删除指定索引位置上的元素（客户）
	 * @param index
	 * @return true:删除成功 false:删除失败
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		// 注意：删除一个元素比如index=2，数组不能是客户0，客户1，null，客户3，客户4.
		// 因为数组是一个有序的，连续的内存空间。所以只能是删掉后，客户3、客户4往前挪，index5的位置成为null

		for (int i = index; i < total - 1; i++) {
			// 不用去写一个实际上的交换
			// Customer temp = customers[i];
			// customers[i] = customers[i + 1];
			// customers[i + 1] = temp;
			// 不用去写一个交换，因为其实只需要后一个覆盖前一个即可，然后最后客户4的元素直接赋值成
			// 写一个覆盖操作即可
			customers[i] = customers[i + 1];
		}
		total--;
		customers[total] = null;
//		或者是合并成一行customers[--total] = null;
		return true;
	}
	
	/**
	 * @description 获取所有的客户信息
	 * @return
	 */
	public Customer[] getAllCustomers(){
		//不要直接返回customers，因为empty slots我们不需要。所以可以重新创建一个数组，只包含有的客户信息
		Customer[] custs = new Customer[total];
		for(int i = 0; i < total; i++){
			custs[i] = customers[i];
		}
		return custs;
	}
	
	/**
	 * @description 获取指定索引位置上的客户
	 * @param index
	 * @return 如果找到了元素，则返回；如果没有找到，则返回null
	 */
	public Customer getCustomer(int index){
		if(index < 0 || index >= total){
			return null;//注意：不能return false，因为该方法的返回值的数据类型不是boolean，而是Customer类，所以是引用数组类型，返回null或者实例对象
		}
		return customers[index];
	}
	
	/**
	 * @description 获取客户的数量
	 * @return
	 */
	public int getTotal(){
		return total;
	}
	
	
	

}
