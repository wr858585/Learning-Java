package com.oono.java1;
/*
 * 方法的重写(override/overwrite)
 * 
 * 1. 重写：子类继承父类以后，可以对父类中同名参数的方法，进行覆盖操作
 * 
 * 2. 应用：重写以后，当创建子类对象以后，通过子类对象call子父类中的同名同参数的方法时，实际执行的是子类重写过的方法
 * 
 * 面试题：区分方法的重载和重写。简单了吧
 * 
 * 3. 重写的规定：
 *    方法的声明：权限修饰符 返回值类型 方法名 (形参列表) throws 异常的类型{
 * 							//方法体
 * 						}
 * 				约定俗称：子类中的叫重写的方法，父类中的叫被重写的方法
 * 需要注意的点：
 * ① 子类重写的方法名和形参列表与父类被重写的方法名和形参列表相同（才能唯一确定是哪个方法）
 * ② 子类重写的方法 的权限修饰符不小于父类被重写的方法的权限修饰符
 * 		>特殊情况：子类不能重写父类中声明为private权限的方法(如果写，则会是一个子类独有的方法)
 * ③ 返回值类型：
 * 		> 父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型只能是void
 * 		> 父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类
 * 		> 父类被重写的方法的返回值类型是基本数类，则子类重写的方法的返回值类型必须是same基本数类
 * ④ 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 * **************************************************************************************
 * 		注意点:子类和父类的同名参数的方法要么都声明为非static的（可以考虑重写）
 * 				要么都为static的（一定不能重写）
 * 			（静态的方法不能被覆盖，是随着类的加载而加载的，之后会讲）
 * 	
 * 
 * 
 */
public class PersonTest {
	
	public static void main(String[] args) {
		
		Student s = new Student("计算机科学与技术");
		s.eat();
		s.walk(10);
		
		s.study();
		
	}
	
	
}