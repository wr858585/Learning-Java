package com.oono.team.service;

import com.oono.team.domain.Employee;

/**
 * @description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 * @author oono
 * @version 1.0
 *
 */
public class NameListService {

	private Employee[] employees;
	
	/**
	 * 给employees及数组元素进行初始化
	 */
	public NameListService(){
//		1. 根据项目提供的Data类构建相应大小的employees数组
//		2. 再根据Data类中的数据构建不同的对象，包括Employee, Programmer, Designer, Architect对象，
//				以及相关联的Equipment子类的对象
//		3. 将对象存于数组中
		employees = new Employee[Data.EMPLOYEES.length];
		
		for(int i = 0; i < employees.length; i++){
			Integer 
		}
		
	}
	
	public Employee[] getAllEmployees(){
		return 
	}
	
	public Employee getEmployee(int id) throws TeamException{
		return 
	}
	
	
}
