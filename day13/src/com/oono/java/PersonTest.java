package com.oono.java;
/*
 * OOP特征之三：多态性 polymorphism
 * 
 * 1. 理解多态性：可以理解为一个事物的多种形态
 * 2. 何为多态性：
 * 		对象的多态性：父类的引用指向子类的对象 i.e new一个类的子类（而不是new它自己这个类）
 * 
 * 3. 多态的使用：虚拟方法调用
 * 		有了对象的多态性以后，我们再编译期，只能调用父类中声明过的方法（如果父类没有，不会调子类的方法）
 * 		但在运行期，实际执行的是子类重写父类的方法
 * 		总结：编译看左边，运行看右边
 * 
 * 4. 多态性的使用前提：① 类的继承关系（要有子类）	② 方法的重写（子类要重写过父类的方法，否则多态没有意义）
 * 
 * 5. 对象的多态性，只适用于方法，不适用于属性（助记：
 * 		所以当Person p1 = new Man();
 * 				p1去调id时候，调出来的是Person类的id。
 * 		
 * 		助记：多态 -> 重写的方法，编译看左边运行看右边。同名的属性，编译和运行都看左边
 * 
 * 6. 
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
		//*******************************************************
		System.out.println("****************************************");
		//（对象的）多态性：父类的引用指向子类的
		Person p2 = new Man();
//		Person p3 = new Woman();
		
		//多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法
//				---这个叫虚拟方法调用
		p2.eat();
		p2.walk();
		
		
//		p2.earnMoney(); 这居然不能调？！
		
		System.out.println(p2.id);//1001 即为父类中定义的属性，而不是子类中的属性
		
		System.out.println("*******************************************");
		
		//不能通过多态，去调用子类中所特有的方法。原因：p2就是一个Person类型
//		p2.earnMoney();
//		p2.isSmoking = true;
		//有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，
//		但是由于变量声明为父类类型(Person p2 = new Man(); 左边是声明，声明是声明的数类！右边只是赋值而已)
//		导致编译时，只能调用父类中声明的属性和方法。子类中特有的结构均不能调用
		
		//如何才能调用子类特有的结构？ ->让编译器看p2不再是Person类，而是Man类的
		//答案：使用强制类型转换符（向下转型）
		Man m1 = (Man) p2;
		m1.earnMoney();
		m1.isSmoking = true;
		
		//使用强转时，可能出现ClassCastException的异常，比如Woman m2 = (Woman) p2; 因为new的p2是Man，这种强转注定失败
//		Woman w1 = (Woman)p2;
//		w1.goShopping();
//		这个编译不会报错，因为语法没错；但是运行抛出ClassCastException异常，因为内存中p2根本没有Woman结构，goShopping根本找不到
		
		/*
		 * instanceof关键字的使用
		 * 
		 * a instanceof A:判断对象a是否是类A的实例。如果是，返回ture；反之，返回false
		 * 
		 * 使用情景（为何要引入这个关键字）：
		 * 		为了避免在向下转型时出现ClassCastException的异常，我们在向下转型时，用instanceof进行判断，
		 * 		如果返回true，就进行向下转型；如果返回false，则不进行向下转型，以避免程序出异常终止运行
		 * 
		 * Statement：如果a instanceof A 返回的是true，则a instanceof B也返回true。
		 * 		可以判断出：其中类B是类A的父类（仔细想下，不是子类）
		 * 		相当于说我a可以instanceof A放进去没问题，则把a放进A的父类肯定也没问题，子类就不一定了
		 * 
		 */
		
		if(p2 instanceof Woman){
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("*********Woman*********");
			//这个run出来没有东西，上一行的打印Woman语句也没有执行，证明if没有进去，因为instanceof返回false
		}
		
		if(p2 instanceof Man){
			Man m2 = (Man)p2;
			m2.earnMoney();
			System.out.println("*********Man***********");
		}
		
		//小练习（巩固instanceof的理解）
		//问题一：编译时通过，运行时不通过
		
		//举例一：
//		Person p3 = new Woman();
//		Man m3 = (Man)p3;
		//抛出ClassCastException异常
		
		//举例二：
//		Person p4 = new Person();
//		Man p4 = (Man)p4;
		//这个也会抛出ClassCastException异常，因为new的是Person的结构，根本没有Man的结构，转过去调Man的方法一定运行不通过
		
		//问题二：编译时通过，运行时也通过
		Object obj = new Woman();
		Person p = (Person)obj;
		//这种在实际开发中是可以的
		
		//问题三：编译时不通过（运行更别想）
//		Man p5 = new Woman();
//		String str = new Date();
		//以上都是：声明的数类A，和new出来的数类B结构，A和B根本没有任何关系，不是子父类（直接/间接），这种不能建立关系
		//ie 不想关的两个东西是不能用=连接的（不能进行赋值的）
		
		
		
	}
}
