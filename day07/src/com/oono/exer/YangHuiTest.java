package com.oono.exer;
/*
 * 使用二维数组打印一个10行的杨辉三角
 * 杨辉三角特点：选定数=上面的数+上面左边的数
 */
public class YangHuiTest {
	public static void main(String[] args) {
		int[][] tri = new int[10][];
//		tri[0][0] = 1;
//		tri[1][1] = 1;
		for(int i = 1; i <= tri.length; i++){
			tri[i][0] = 1;
			for(int j = 1; j <= tri.length; j++){
				tri[i][j] = tri[i-1][j] + tri[i-1][j-1];
				System.out.print(tri[i][j] + "\t");
			}
		}
		System.out.println();
	}

}
