package com.oono.java1;
/*
 * 总结：属性赋值的现后顺序
 * 
 * ① 默认初始化
 * ② 显式初始化
 * ③ 构造器中初始化
 * ④ 通过 obj.field & obj.method 来赋值
 * 
 * 测试发现：顺序就是 ① ② ③ ④，后面的赋值会覆盖前面的
 * 
 */
public class UserTest {
	public static void main(String[] args) {
		
		User user = new User(3);
		
		System.out.println(user.getAge());
		
		user.setAge(2);
		
		System.out.println(user.getAge());
		
	}
}

class User{
	
	//field
	private int age = 1;//这就叫做显式初始化，类似于初始化条件的感觉
	
	//constructor
	public User(){
		
	}
	
	public User(int a){
		age = a;
	}
	
	//method
	public void setAge(int a){
		age = a;
	}
	
	public int getAge(){
		return age;
	}
}