package com.oono.java1;
/*
 * 接口的使用：
 * 1. 接口使用interface来定义
 * 2. java中，接口和类是并列的两个结构
 * 3. 如何定义接口：定义接口中的成员（接口中定义的结构都是public的）
 * 
 * 		3.1 JKD7及以前：只能够定义全局常量和抽象方法
 * 			> 全局常量：public static final（但是书写时，可以省略不写。跟构造器super()一样）
 * 			> 抽象方法：public abstract
 * 		3.2 JDK8：除了可以定义全局常量和抽象方法外，还可以定义静态方法和默认方法（以后再说）
 * 
 * 4. 接口中一定不能写构造器，意味着接口不可以实例化
 * 
 * 5. java开发中，接口都是通过让类去实现（implements）的方式来使用
 * 		如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 * 		如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍是一个抽象类
 * 
 * 6. java类可以实现多个接口（多实现性） ---> 从而弥补了java单继承性的局限
 * 		格式：class AA extends BB implements CC,DD,EE
 * 
 * 7. 接口与接口之间可以继承，而且是多继承
 * 
 * *******************************************
 * 
 * 8. 接口的具体使用，体现了多态性
 * 9. 接口，in essence，可以看作是一种规范（体现了现实世界中“如果你要……则必须能……”的思想）
 * 
 * 面试题：抽象类与接口又哪些异同
 * 		同：都不能实例化
 * 
 * 
 * 
 */
public class InterfaceTest {

	public static void main(String[] args){
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
//		Flyable.MIN_SPEED = 2; //The final field Flyable.MIN_SPEED cannot be assigned 因为接口中不管写不写，默认都是public static final的结构
		
		Plane plane = new Plane();
		plane.fly();
		
	}
}

interface Flyable{
	
	//全局常量
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	int MIN_SPEED = 1;//接口中可以省略不写public static final，因为全都是全局常量，没有第二种情况，可省代码
	
	//抽象方法
	public abstract void fly();
	
	void stop();//也可以省略public abstract，因为全都是抽象方法
	
	//Interfaces cannot have constructors.
//	public Flyable(){
//		
//	}
	
}

interface Attackable{
	
	void attack();
	
}


class Plane implements Flyable{

	@Override
	public void fly() { //左边不是重写的实心小三角override（抽象类），而实现类左边是空心小三角，我们一般不叫重写了，叫实现implement
		// TODO Auto-generated method stub
		System.out.println("通过引擎起飞");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("驾驶员减速停止");
	}
	
}

abstract class Kite implements Flyable{
	
	//这个类Kite没有重写完接口中所有的抽象方法，所以只能是抽象类，否则报错
	public void fly(){
		System.out.println("风筝飞高高");
	}
	
}

class Bullet implements Flyable, Attackable, CC{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}

//**********************************************

interface AA{
	void method1();
}

interface BB{
	void method2();
}

interface CC extends AA, BB{
	
}

