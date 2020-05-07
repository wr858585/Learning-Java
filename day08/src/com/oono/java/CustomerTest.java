package com.oono.java;
/*
 * 类中method的声明和使用
 * 
 * 方法：描述class应具有的功能function
 * 比如：Math类：sqrt()\random()\etc
 * 		Scanner类：nextXxx()...用于从键盘获取各种数据
 * 		Arrays类：sort()\binarySearch()\toString\equals()\etc
 * 
 * 1.举例：
 * public void eat(){
 * public void sleep(int hour){
 * public String getName(){
 * public String getNation(String nation){
 * 
 * 2.方法的声明：权限修饰符 返回值类型 方法名(形参列表){
 * 						方法体
 * 				}
 * 
 * p.s 其他关键字，如：static final abstract 等等也可以用来修饰method，optional
 * 之后会讲到
 * 
 * 3.说明：
 * 		3.1关于权限修饰符：
 * 			Java规定的4种权限修饰符：private, public, 缺省, protected
 * 		
 * 		3.2返回值类型：有VS无
 * 			3.2.1如果method有return value，则必须在declare时，就指定其数类
 * 				同时，method中必须使用return关键字来返回该指定的数类的var或constant
 * 				如果method里屋返回值，则声明方法时，使用void表示。
 * 					如果没有用void的method，也可以在内部使用return，
 * 					但只能写成：return; 用来结束此方法
 * 
 * 			3.2.2我们定义method到底应不应该有返回值？->具问具析
 * 
 * 		3.3方法名：属于标识符identifier,遵循标识符的命名规则和规范，做到见名知意
 * 
 * 		3.4形参列表：方法可以0-n个形参，构成一个形参列表。
 * 				3.4.1格式：数类1 形参1，数类2 形参2 etc
 * 				3.4.2我们定义method时，到底要不要定义形参 ->具问具析
 * 
 * 		3.5方法体：方法功能的真正体现，内核
 * 
 * 4.return关键字的使用：
 * 		4.1使用范围：再method中
 * 		4.2作用：①退出当前method ②return数据
 * 		4.3注意：return后面的code is unreachable
 * 
 * 5.方法的使用中，可以call当前class的field和method
 * 		特殊的：方法A中又再次call方法A ->recursion
 * 		方法中，不可以定义方法（同py不同）
 * 
 * p.s return关键字的使用：
 * 		1.作用范围：方法体内
 * 		2.作用：①结束方法 ②return数据
 * 		3.return ends a method whilst break ends a loop, 之后的code都unreachable
 * 
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer u1 = new Customer();
		u1.sleep(5);
	}
}

//客户类
class Customer{
	
	//field
	String name;
	int age;
	boolean isMale;
	
	//method
	public void eat(){
		System.out.println("客户吃饭");
		return;
		//System.out.println("求你执行我");
		//return后不可以再写code了，因为不会读到，显示：unreachable code
	}
	
	public void sleep(int hour){
		System.out.println("休息了" + hour + "个小时");
		sleep(10);
	}
	
	public String getName(){
		return name;
	}
	
	public String getNation(String nation){
		String info = "我的国籍是：" + nation;
		return info;
	}
}