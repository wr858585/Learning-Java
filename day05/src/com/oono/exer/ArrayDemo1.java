package com.oono.exer;

import java.util.Scanner;

/*
 * 2. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 		成绩>=最高分-10：等级A
 * 		成绩>=最高分-20：等级B
 * 		成绩>=最高分-30：等级C
 * 		其余：等级D
 */
public class ArrayDemo1 {
	public static void main(String[] args) {
		// 1.使用Scanner，读取学生人数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生人数");
		int num = scanner.nextInt();

		// 2.创建数组，存储学生成绩：动态初始化
		int[] scores = new int[num];

		// 3.给数组中的元素赋值
		System.out.println("请输入" + num + "个学生成绩");
		for (int i = 0; i < num; i++) {
			scores[i] = scanner.nextInt();
		} // Difficult

		// 4.获取数组中元素的max
		int maxScore = 0;
		for (int i = 0; i < num; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}//3&4可以优化，两个loop合在一起写
		}

		// 5.获取最高分的差值，转成成绩等级
		char level;
		for (int i = 0; i < num; i++) {
			if (maxScore - scores[i] <= 10) {
				level = 'A';
			} else if (maxScore - scores[i] <= 20) {
				level = 'B';
			} else if (maxScore - scores[i] <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			System.out.println("student" + i + "score is " + scores[i] + ", graded " + level);
		}
	}
}
