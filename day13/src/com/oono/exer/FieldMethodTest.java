package com.oono.exer;
/*
 * 可以看成是一道笔试题！
 * 
 * 这个作为一道题，考察知识点才会把子父类写同名的属性，可见其实难区分，实际开发中当然主动避免
 * 方法可以写重名的，意味着我们要override。属性写重名，纯属自找麻烦，而且维护不便
 * 
 * 考察点：
 * 1. 若子类重写了父类方法，就意味着子类里定义的方法彻底覆盖了父类中的同名方法，
 * 系统将不可能把父类里的方法转移到子类中（编译看左边，运行看右边）ie多态的基本应用
 * 
 * 2. 对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
 * 这个实例变量依然不可能覆盖父类中定义的实例变量（说的是属性，编译运行都看左边）ie多态不涉及的点
 * 
 */

class Base{
	int count = 10;
	
	public void display(){
		System.out.println(this.count);
	}
}

class Sub extends Base{
	int count = 20;
	
	public void display(){
		System.out.println(this.count);
	}
}

public class FieldMethodTest {
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.count);//20
		s.display();//20
		Base b = s;//这是一个典型的多态写法了，把一个子类的结构赋给了父类的引用
		System.out.println(b == s);//true 因为引用数类==比较的是地址值，两个变量都指向new的Sub()结构，上一行也把s的地址值赋给b了（引用数类=赋的是地址值）
		System.out.println(b.count);//10
		b.display();//20
	}
}
