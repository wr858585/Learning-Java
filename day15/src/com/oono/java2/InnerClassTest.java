package com.oono.java2;
/*
 * 类的内部成员之5：内部类
 * 
 * 1. java中允许将一个类A声明在另一个类B中，则A就是内部类，B就是外部类
 * 
 * 2. 内部类分类：成员内部类（静态&非静态） vs 局部内部类（方法内、代码块内、构造器内）
 * 		这两个的区分，和成员变量 vs 局部变量是一样的
 * 		成员变量：就是定义在方法、构造器、代码块之外的变量，作用于整个类（生命周期和类一样）
 * 		局部变量：就是定义在局部的，随着载体消亡而消亡的变量（声明周期和载体一样）
 * 					比如：方法体中，代码块中，形参etc
 * 
 * 3. 成员内部类：
 * 		一方面，作为外部类的成员：
 * 			> 可以调用外部类的结构（如静态只能调静态）
 * 			> 可以被static修饰（static可以修饰的都是类的内部结构，除了构造器）
 * 			> 可以被4种不同的权限修饰
 * 
 * 		另一方面，作为一个类：
 * 			> 可以定义属性、方法、构造器等（也可以无限套娃内部类哈哈）
 * 			> 可以被final修饰（表示此内部类不能被继承）；不适用final则此内部类可以被继承
 * 			> 可以被abstract修饰（表示此内部类不能被实例化）；
 * 
 * 4. 关注如下的三个问题
 * 		4.1 如何实例化成员内部类的对象
 * 		4.2 如何在成员内部类种区分调用外部类的结构
 * 		4.3 开发中局部内部类的使用，见《InnerClassTest1》
 * 
 */
public class InnerClassTest {

	public static void main(String[] args) {
		
		//创建Dog实例（静态的成员内部类）：
		Person.Dog dog = new Person.Dog();
		dog.show();
		//创建Bird实例（非静态的成员内部类）：
		Person p = new Person();
		Person.Bird bird = p.new Bird();
		bird.sing();
		
		System.out.println();
		
		bird.display("黄鹂");
		
		
	}
	
}

class Person{
	
	String name = "小明";
	int age;
	
	public void eat(){
		System.out.println("人：吃饭");
	}
	
	
	//静态成员内部类
	static class Dog{
		String name;
		int age;
		
		public void show(){
			System.out.println("卡拉是条狗");
//			eat();//Cannot make a static reference to the non-static method eat() from the type Person
		}
		
	}
	//非静态成员内部类
	final class Bird{
		String name = "杜鹃";
		
		public Bird(){
			
		}
		
		public void sing(){
			System.out.println("我是一只小小鸟");
			Person.this.eat();//调用外部类的非静态方法，
			//直接this.eat()表示当前对象Bird实例化对象的eat()，是没有的，报错。undefined
		}
		
		public void display(String name){
			//变量一定不要重名，不然就这么麻烦。不重名直接VAR名放进去sysout，重名就得告诉编译器，调用的具体结构，谁调的
			System.out.println(name);//打印：此方法的name形参
			System.out.println(this.name);//打印：内部类的name属性
			System.out.println(Person.this.name);//打印：外部类的name属性
//			System.out.println(Person.name);只有Person中的name为静态才能这样调，否则this.表示当前对象的，有了实例才能调
		}
	}
	
	
	public void method(){
		//局部内部类1：方法体中
		class AA{
			
		}
	}
	
	{
		//局部内部类2：代码块中
		class BB{
			
		}
	}
	
	public Person(){
		//局部内部类3：构造器中
		class CC{
			
		}
	}
	
	
}