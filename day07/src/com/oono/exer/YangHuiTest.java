package com.oono.exer;

/* array.alrogithm的考察点一：ele的赋值
 * 使用二维数组打印一个10行的杨辉三角
 * 杨辉三角特点：选定数=上面的数+上面左边的数
 */
public class YangHuiTest {
	public static void main(String[] args) {
		
		// 1.声明+初始化
		int[][] tri = new int[10][];
		
		// 2.给ele赋值
		for (int i = 0; i < tri.length; i++) {
			tri[i] = new int[i + 1];
			
		//2.1给首末元素赋值	
			tri[i][0] = tri[i][i] = 1;
			
		//2.2给其他位置的元素赋值
			if(i > 1){//这个条件其实可以去掉，因为当i == 0 或者1时，j的循环条件为false
				//这个内层循环的初始化条件，循环条件，都有变化，注意理解
				for(int j = 1; j < tri[i].length - 1; j++){
					tri[i][j] = tri[i-1][j] + tri[i-1][j-1];
				}
			}
				
			}
		// 3.遍历
		for (int i = 0; i < tri.length; i++) {
			for (int j = 0; j < tri[i].length; j++) {
				System.out.print(tri[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
