package com.oono.exer;
/*
 * 3.1编写程序，声明一个method方法，再方法中打印一个10*8的*矩形，再main方法中call it
 * 3.2修改上一个程序，再method方法中，除了打印之外，再计算举行的面积，
 * 		并将其作为方法的返回值返回。再main方法中call it，接受返回的面积值并打印
 * 3.3修改上一个程序，再method方法中提供m和n两个参数，方法中打印一个m*n的举行，
 * 		并计算面积，将其作为方法返回值。再main方法中call it，接受返回的面积值并打印
 */
public class Exer3Test {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.output(8,9));
	}
}

//矩形类
class Rectangle{
	
	//field
	int length, height;
	
	//method
	public int output(int m, int n){
		
		int area = m * n;
		
		for(int i = 0; i < m; i++){

			for(int j = 0; j < n; j++){

				System.out.print('*');
				
			}
			System.out.println();
		}
		
		return area;
	}
}