package com.oono.exer;


//考察多态的笔试题目：
public class InterviewTest1 {

	public static void main(String[] args) {
		Base1 base = new Sub1();
		//练习1：下一行的输出结果是：sub_1 因为子父类方法确实是重写，形参列表实质是一样的
//		（也证明这两个方法不能再同一个类中构成重载）[overload:同一个类中 override:子父类中]
		base.add(1, 2, 3);
		
		//练习3：再做一个新的测试，输出结果是：sub_2 因为此时base向下转型，用强转符变成了Sub类，并赋给了新变量s
//		那么s.add(1,2,3)直接就是去调用Sub类中的方法了，都跟父类没有关系，不存在多态了（不涉及子父类，都在Sub类中）
//		此时Sub类有两个重载的方法，当调用的形参列表pinpoint精准满足重载方法A时，会调A，而不会去调不定长的那个
		Sub1 s = (Sub1)base;
		s.add(1,2,3);
	}
}

class Base1{
	public void add(int a, int... arr){//int...是可变形参
		System.out.println("base1");
	}
}

class Sub1 extends Base1{
	
	public void add(int a, int[] arr){
		System.out.println("sub_1");
	}
	
	//练习2：再添加一个方法，重新测试练习1的输出结果，结果是：sub_1
//	因为base.add(1,2,3)先调的是父类Base类中的虚拟方法，如果子类中有重写的方法，才去调
//	而下面的这个方法根本不是父类方法的重写，只有三个参数如何重写不定长参数的方法，只是一个子类中自己的方法了
//	所以仍然调的是重写的不定长参数的方法，输出sub_1不变
	public void add(int a, int b, int c){
		System.out.println("sub_2");
	}
	
}