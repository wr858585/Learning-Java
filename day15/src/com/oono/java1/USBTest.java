package com.oono.java1;
/*
 * 接口的使用
 * 
 * 1. 接口使用上也满足多态性（也依赖多态来完成自己的功能。如果没有多态，抽象类和接口都用不了）
 * 2. 接口，实际上就是定义了一种规范（不同的class如果要遵守所有规范（实现所有抽象方法），否则也不能造对象）
 * 		如：JDBC定义了很多规范（操作数据库的规范），是java去操作不同的数据库的接口
 * 			enabling java applications to operate on various databases
 * 3. 在开发中，要体会面向接口编程，以不变应万变，从容开发
 * 		如：操作数据库，不会针对每个数据库，而是用java的JDBC，JDBC提供了所有数据库的规范（很多接口）
 * 		i.e 增加一行数据，不同数据库可能add(),insert()层出不穷，实现方式和达到效果也不一样
 * 			这样的话，我们开发一个java程序，要针对不同的数据库进行不同的接口开发，非常累
 * 			SUN公司就设计了JDBC，就是一种规范，里面抽象了很多方法等等，如增加数据统一为add()
 * 			但是不可能知道每个数据库怎么实现的，所以为抽象方法
 * 			但是:这个抽象方法就能保证每个数据库不管怎么写add()代码，最后都会形式/格式上和我的抽象方法add()统一
 * 			这样，就实现了我们java程序员在做开发时，只用add()，不用考虑其他形式/写法
 * 			而传入实参的时，传不同的数据库的实例即可，非常方便（这里又是多态的体现）
 * 
 */
public class USBTest {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		//1. 接口的非匿名实现类+非匿名对象（obj: flash）
		//体现了接口的多态（接口没有构造器无法实例化自己造对象，只能这样通过多态来实现）
		Flash flash = new Flash();
		com.transferData(flash);
		
		//2. 接口的非匿名实现类+匿名对象（接口定义完整在下面）(obj:new出来的匿名对象）
		com.transferData(new Printer());
		
		//3. 接口的匿名实现类+非匿名对象（接口未完整定义，没有接口名只有里面的内容，匿名接口的实现类）
//				(obj: phone)
		USB phone = new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("手机开始工作");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("手机结束工作");
			}
			
		};
		com.transferData(phone);
		
		//4. 接口的匿名实现类+匿名对象（obj：new出来的对象）
		com.transferData(new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("mp3开始工作");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("mp3结束工作");
			}
			
		});
		
	}
	
	
}

class Computer{
	
	public void transferData(USB usb){
		
		usb.start();
		
		System.out.println("具体的传输数据的细节");
		
		usb.stop();
		
	}
}



interface USB{
	
	//定义了长、宽、最大/小的传输速度等
	
	void start();
	
	void stop();
	
}

class Flash implements USB{
	
	public void start(){
		System.out.println("U盘开启工作");
	}
	
	public void stop(){
		System.out.println("U盘结束工作");
	}
}

class Printer implements USB{
	
	public void start(){
		System.out.println("打印机开始工作");
	}
	
	public void stop(){
		System.out.println("打印机停止工作");
	}
	
	
}