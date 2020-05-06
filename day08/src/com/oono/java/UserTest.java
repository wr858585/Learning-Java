package com.oono.java;
/*
 * 类中field的使用
 * 
 * 属性（又叫成员var） VS 局部var
 * 1.相同点：
 * 		1.1定义var的格式一样：数据类型 var名 = var值
 * 		1.2先声明，后使用
 * 		1.3var都有其对应的作用域scope
 * 
 * 
 * 2.不同点：
 * 		2.1在class中声明的位置有所不同
 * 		属性field：直接定义在class的一对{}中
 * 		局部变量local var：声明在方法内、方法形参、代码块中、构造器形参、构造器内部的var
 * 
 * 
 */
public class UserTest {

}

class User{
	
	//属性field（又叫成员var）
	String name;
	int age;
	boolean isMale;
	
	
	public void talk(String language){//language：形参（也是局部变量）
		System.out.println("我们使用" + language + "进行交流");
		
	}
	
	public void eat(){
		String food = "烙饼";//局部变量
		System.out.println("北方人喜欢吃" + food);
	}
}