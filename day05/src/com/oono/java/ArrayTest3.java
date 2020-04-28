package com.oono.java;
/*
 * 2.需要掌握的点（续）
 * 
 * 2.5 二维数组元素的初始化默认值
 * 
 * 行话：外层数组，内层数组；
 * 		 外层元素：arr[i]
 * 		 内层元素: arr[i][j]
 * 
 * 结论：
 * 针对初始化方式一：int[][] arr = new int[i][j];
 * 		外层ele的初始化值为：一维数组的address
 * 		内层ele的初始化值为：与内层ele的初始化情况相同
 * 			如int-0；double-0.0；String和其他引用数类-null；
 * 针对初始化方式二：int[][] arr = new int[i][];
 * 		外层ele的初始化值为：null
 * 		（因为是未分配空间的数组，数组为引用数类，默认null。已分配地址的数组，则会显示具体地址）
 * 		内层ele的初始化值为：不能调用，否则空指针异常
 * 
 * 
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);//[I@15db9742 
//		[代表一维数组 I代表为int类的一维数组 @代表其物理地址在后面
		System.out.println(arr[0][0]);//0
		System.out.println(arr);//[[I@6d06d69c 
//		[[代表二维数组 I代表为int类的二维数组 @代表其物理地址
		
		//难
		String[][] arr1 = new String[4][3];
		System.out.println(arr1);//[[Ljava.lang.String;@7852e922
		//String类的地址会把其类也显示出来：java.lang.String
		System.out.println(arr1[0]);//[Ljava.lang.String;@4e25154f
		//第一个内层数组，其默认值也是地址
		System.out.println(arr1[0][0]);//null
		//内层数组的第一个元素为String（不是数组了！！是基本数类）
//		所以其默认值为null（一维数组讲过）
		
		//难
		String[][] arr2 = new String[4][];
		System.out.println(arr2);//二维数组的地址
		System.out.println(arr2[0]);//一维数组的地址？
		//不对。是null。难
		//因为这个一维数组未确定长度，所以未分配空间，没有地址。
		//而数组是一个引用数类，默认值为null（与line27做对比）
	    //（因为！如果有地址，则不用显示默认的null，显示具体地址即可）
		System.out.println(arr2[0][0]);
		//空指针异常：java.lang.NullPointerException
		
	}
}
