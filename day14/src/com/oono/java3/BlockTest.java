package com.oono.java3;
/*
 * 类的成员之四：代码块（又叫初始化块）
 * 
 * 1. 代码块的作用：用来初始化类、对象（所以又叫初始化块）
 * 2. 格式极简，就是{}，最多只有一个东西修饰，前面加static。（如果有修饰的话，只能使用static）
 * 3. 分类：静态代码块 vs 非静态代码块
 * 
 * 4. 静态代码块
 * 		> 内部可以有输出语句
 * 		> 随着类的加载而执行了！（而不是其他static结构如静态属性，静态方法，是随着类的加载而加载，但不会执行！需要类.去调用）
 *		> 因为类只会加载一次，所以静态代码块只会执行一次as long as类没有重新加载 
 *		> 作用：初始化类的信息
 * 		> 如果一个类中定义了多个静态代码块，则按照声明的现后顺序执行
 * 		> 静态代码块的执行，要优先于非静态代码块的执行（因为前者随类的加载而执行，后者随对象的创建而执行）
 * 		> 静态代码块内，只能调用静态的结构
 * 
 * 5. 非静态代码块
 * 		> 内部可以有输出语句
 * 		> 随着对象的创建而执行
 * 		> 每创建一个对象，就执行一次非静态代码块
 * 		> 作用：可以在创建对象时，对对象的属性等进行初始化（让属性的赋值又多了一个可能，在这个位置赋值）
 *		> 如果一个类中定义了多个非静态代码块，则按照声明的现后顺序执行
 *		> 非静态代码块内，可以调用静态/非静态的结构
 *
 * 注意：实际开发中，不用写多个静态/非静态代码块，因为和方法不一样，都会执行的，不用调，所以没啥意义
 * 		所以一般就写一个静态/非静态代码块		
 * 
 * 对属性可以赋值的位置：
 * ① 默认初始化
 * ② 显式初始化
 * ③ 构造器中初始化
 * ④ 有了对象以后，可以通过“对象.属性”或者“对象.方法”的方式进行赋值
 * ⑤ 在代码块中赋值
 * 
 * 
 * 
 */
public class BlockTest {

	public static void main(String[] args) {
		
		String desc = Person.desc;//类什么时候加载到RAM中？并非程序一开始全部加载好，而是调用时
		//此时，我们调用Person类的静态属性，则Person类就会加载到RAM中了
		System.out.println(desc);
		
		Person p1 = new Person();//创建对象后，非静态代码块会执行
		Person p2 = new Person();
		
		
	}
}

class Person{
	
	//field
	String name;
	int age;
	static String desc = "我是一个人";
	
	//constructor
	public Person(){
		
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//block
	
	//static block
	static{
		System.out.println("hello, static block-1");
		desc = "我是一个爱学习的人";
	}
	static{
		System.out.println("hello, static block-2");
	}
	
	//非静态代码块
	{
		System.out.println("hello, block");
	}
	
	//method
	public void eat(){
		System.out.println("吃饭");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void info(){
		System.out.println("我是一个快乐的人");
	}
	
}