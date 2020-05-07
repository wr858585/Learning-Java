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
 * 		2.2关于权限修饰符的不同
 * 		field:可以在声明属性时，指明其权限，使用权限修饰符。
 * 		常用的权限修饰符：private, public, 缺省, protected -->封装encapsulation
 * 		local var：不能使用权限修饰符
 * 
 * 		2.3默认初始化值不同
 * 		field:其初始化值和array讲的一样
 * 			整形：byte, short, int, long -> 0
 * 			浮点型：float, double -> 0.0
 * 			字符型：char -> 0 or '\u0000'
 * 			布尔型：false
 * 			引用类型(类、接口、字符串）：null
 * 		local var:没有dafault value！！
 * 				i.e如果不赋值，则会报错！！
 * 				特别地，形参在调用时，我们再赋值即可
 * 
 * 		2.4在RAM中加载的位置
 * 		field：加载到heap中（非static的放在堆中，static的在方法区中）
 * 		local var：加载到stack中
 */
public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1);//com.oono.java.User@15db9742
		System.out.println(u1.name);//null
		System.out.println(u1.age);//0
		System.out.println(u1.isMale);//false
	}
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
		String food = "烙饼";//局部变量。如果不赋值，只进行declare，则会报错！！
		//报错为：The local variable food may not have been initialized.
		System.out.println("北方人喜欢吃" + food);
	}
}