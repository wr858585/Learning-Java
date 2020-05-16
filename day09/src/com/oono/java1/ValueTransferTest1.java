package com.oono.java1;
/*
 * 方法的形参传递机制：值传递
 * 
 * 1.形参：方法定义时，声明在()里的args
 *   实参：方法调用时，实际传递给形参的数据
 *   
 * 2.值传递机制：
 * 如果arg是基本数类，此时实参assign给形参的是：实参存储的值value！
 * 如果arg是引用数类，此时实参assign给形参的是：实参存储的地址address！
 * 为何这点很重要？因为value不会更改heap中的obj，而address会更改到，因为address让指针指向它了
 * 类比更改a的值，和更改a.field的值，前者assign不会影响到obj，后者更改会。
 * 
 */
public class ValueTransferTest1 {
	public static void main(String[] args) {
		
		int m = 10;
		int n = 20;
		
		System.out.println("m = " + m + ", n = " + n);
		
//		//交换两个var值的操作
//		int temp = m;
//		m = n;
//		n = temp;
		
		ValueTransferTest1 test = new ValueTransferTest1();
		test.swap(m, n);//这里的m&n为line 16-17中的实参，会传给line34中的m&n(形参)
		
		System.out.println("m = " + m + ", n = " + n);
		
		//输出结果：m = 10, n = 20
//				   m = 10, n = 20
//		并没有swap成功！
//		简化理解：基本数类的assign，只是assign its value。
//		i.e把m&n两个var的值作为实参传入swap方法，交换一下值，完了。
//		因为swap方法里面的m&n交换了值，但是swap方法一旦完了之后m和n这两个loca var会出栈
//		然而main方法中的local var m&n还是原来的值，因为是不同的local var
		
	}
	
	public void swap(int m, int n){
		int temp = m;
		m = n;
		n = temp;
	}
}
