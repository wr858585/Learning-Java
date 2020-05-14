package com.oono.java;
/*
 * 一、理解“万事万物皆对象”
 * 1.在Java语言范畴中，我们都将func，structure等都封装到class中，通过class的实例化
 * 		call实例化的结构解决问题
 * 		e.g 封装到Scanner, String中
 * 			封装到File中（某个文件）
 * 			封装到URL中（某个网络资源）
 * 2.在Java跟其他语言进行交互的时候（如和前端的HTML CSS JS语言交互）（和后端的数据库交互）
 * 		这些其他语言的东西（i.e 结构）传给Java时，都是以类的形式传递
 * 		如：数据库中的员工表传为员工这个类，员工的薪资、年龄etc传为这个类的field
 * 
 * 二、内存解析的说明
 * 1.引用类型的var，在RAM中只可能存储为：要么null，要么一个具体的address
 * 
 * 三、匿名对象的使用 anonymous var
 * 1.理解：new一个obj，但是不赋值给var，i.e没有指针给它  ->匿名对象
 * 2.特点：只能call一次（因为没有指针可以再次调用它）
 * 3.实际开发中的使用：当只会需要new一次，之后不再需要call的情况
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.sendMail();
		p.playGame();
		
		//anonymous var
		new Phone().sendMail();
		new Phone().playGame();
		//以上其实生成了两个匿名变量，每new一次就是一个新的obj
		
		new Phone().price = 1999;
		new Phone().showPrice();//0.0 因为是两个匿名var
		
		System.out.println("********************");
		
		PhoneMall mall = new PhoneMall();
		mall.show(new Phone());//这里就是直接传了一个匿名var作为形参（实际开发会用）
		
	}
}

class PhoneMall{
	
	//field
	public void show(Phone phone){
		phone.sendMail();
		phone.playGame();
	}
}

class Phone{
	
	//field
	double price;
	
	//method
	public void sendMail(){
		System.out.println("发送邮件");
	}
	
	public void playGame(){
		System.out.println("玩游戏");
	}
	
	public void showPrice(){
		System.out.println("手机价格为：" + price);
	}
}