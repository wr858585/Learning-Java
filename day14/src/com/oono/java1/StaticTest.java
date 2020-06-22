package com.oono.java1;
/*
 * static关键字的使用
 * 
 * 1.static：静态的
 * 2.static：可以用来修饰/调用类的结构中的：属性、方法、代码块、内部类（没有构造器！）
 * 
 * 3.使用static来修饰属性：叫做静态变量（又叫类变量，助记：该变量归类所有，跟实例无关）
 * 		3.1 属性，按是否使用static修饰，又分为：静态属性 vs 非静态属性（又叫实例属性/实例变量）
 * 		实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的实例变量/实例属性/非静态属性
 * 				当修改其中一个对象中的非静态属性时，不会导致其他对象中的同样的属性值的修改（以前学的）
 * 		静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。
 * 				当通过某一个对象去修改静态变量时，会导致其他对象调用此静态变量时，是修改过的
 * 		3.2 static修饰属性的其他说明：
 * 			① 静态变量随着类的加载而加载，可以通过“类.静态变量”的方式进行调用
 * 				（实例变量随着对象的创建而加载，所以静态变量加载得早）
 * 			② 静态变量的加载要早于对象的创建。
 * 			③ 由于类只会加载一次，则静态变量在RAM中也只会存在一份：存在方法区的静态域static field中
 * 
 *			④ 			类变量		实例变量
 *			类			yes			no（实例变量归某个对象所有，类调不了）
 *			对象			yes			yes 			
 *
 *		3.3 静态属性举例：System.out; Math.PI
 * 
 * 4.使用static来修饰方法：静态方法
 * 		① 随着类的加载而加载，可以通过"类.静态方法"的方式来调用（不用非要创建obj来调用了）
 * 		② 				静态方法		非静态方法
 * 			类			yes			no
 * 			对象			yes			yes
 * 		③ 静态方法中，只能调用静态的方法或属性
 * 		    非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
 * 
 * 5. static注意点：
 * 		① 在静态的方法内，不能使用this关键字、super关键字（因为实例对象还未创建，this就是当前对象的，super为当前对象父类的）
 * 		② system.out.println(nation);nation前其实是省略了Chinese. 可不是省略了this.
 * 		③ 关于静态属性和静态方法的使用（类/实例能调谁，不能调谁），都从生命周期的角度去理解
 * 			i.e RAM中先加载的结构不能调用后加载的（如类不能调用非静态方法，非静态属性，即实例中的结构）
 * 				RAM中后加载的结构可以调用先加载的（如实例可以调用类中的静态结构）
 * 
 * 6A. 开发中，如何确定过一个属性是否要声明为static的？
 * 		> 属性是可以被多个对象所共享的，不会随着对象的不同而不同的
 * 		> 类中的常量也常常声明为static（如final修饰的，表示为常量，数值不改变）
 * 
 * 6B. 开发中，如何确定过一个方法是否要声明为static的？
 *		> 操作静态属性的方法，通常设置为static的（保持两者生命周期一致，严密）
 *		> 工具类中的方法，习惯上声明为static的。比如：Math，Arrays，Collections工具类方法都静态，
 *			直接调，不用造对象去调，因为这些方法无论什么对象去调都一样，不会说有什么不同 
 */
public class StaticTest {

	public static void main(String[] args) {
		
		Chinese.nation = "中国";
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		c1.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		c2.nation = "China";
		
		System.out.println(c1.nation);//China
		
		//用类去调非静态变量/实例变量，则编译不通过
//		Chinese.name = "张继科";因为不能把所有中国人的名字都改成张继科啊
		
		c1.eat();
		
		Chinese.show();
//		Chinese.info();类也不能调用非静态方法，因为每个obj都有一个，调谁呢（和非静态变量不能掉一个道理）
		
	}
}

class Chinese{
	
	String name;
	int age;
	static String nation;
	
	public void eat(){
		System.out.println("中国人吃中餐");
	}
	
	public static void show(){
		System.out.println("我是一个中国人！");
	}
	
	public void info(){
		System.out.println("name: " + name + ", age:" + age);
	}
	
	
}