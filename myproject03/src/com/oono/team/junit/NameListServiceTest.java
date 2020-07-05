package com.oono.team.junit;

import org.junit.Test;

import com.oono.team.domain.Employee;
import com.oono.team.service.NameListService;

/**
 * 对NameListService类的测试	
 * @author oono
 *
 */
public class NameListServiceTest {

	@Test
	public void testGetAllEmployees(){
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for(int i = 0; i < employees.length; i++){
			System.out.println(employees[i]);
		}
	}
}
