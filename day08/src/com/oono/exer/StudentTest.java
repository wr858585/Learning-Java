package com.oono.exer;

/*
 * 4.对象数组题目
 * 定义类Student，包含三个属性：学号number(int),年级year(int),成绩score(int).
 * 创建20个学生对象，学号1-20，年级和成绩都由随机数确定。
 * 问题一：打印出三年级学生的学生信息。
 * 问题二：使用冒泡排序按学生成绩进行排序，并遍历所有学生信息。
 * 
 * Hint：
 * 1）生成随机数用Math.random(),返回结果为double.
 * 2）四舍五入取整，用Math.round(double d),返回类型为long.
 */
public class StudentTest {
	public static void main(String[] args) {

		// 创建1个包含20个学生的数组 -> 将每个实例作为ele，用数组！！
		Student[] stus = new Student[20];

		for (int i = 0; i < stus.length; i++) {
			// 给数组的ele赋值
			stus[i] = new Student();
			// 给Student对象的field赋值
			stus[i].number = i + 1;
			// 年级：[1,6]
			stus[i].year = (int) (Math.random() * (6 - 1 + 1) + 1);
			// 成绩：[0,100]
			stus[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);
		}

		// 遍历数组(可以被Student类中定义一个方法info代替)
		// for (int i = 0; i < stus.length; i++) {
		// System.out.println(stus[i].number + "," + stus[i].year + "," +
		// stus[i].score);
		// }

//		 遍历数组
		 for(int i = 0; i < stus.length; i++){
		 System.out.println(stus[i].info());
		 }
		 System.out.println("*************************");

		// 问题一：打印出三年级学生的学生信息。
		 for (int i = 0; i < stus.length; i++) {
		 if (stus[i].year == 3) {
		 System.out.println(stus[i].info());
		 }
		 }
		 System.out.println("************************");

		// 问题二：使用冒泡排序按学生成绩进行排序，并遍历所有学生信息。
		for (int i = 0; i < stus.length - 1; i++) {// 需要n-1个大轮,每轮排出其最大值

			for (int j = 0; j < stus.length - 1 - i; j++) {// 需要n-1-i个小轮，

				if (stus[j].score > stus[j + 1].score) {
//					int temp = stus[j].score;
//					stus[j].score = stus[j + 1].score;
//					stus[j + 1].score = temp;
//					这种是错误的，因为光交换了score，那么同学A得到C的成绩！全乱了！！
					Student temp = stus[j];//temp的数类是Student这个类！才能换
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
//		// 最后遍历所有已按成绩高低排序好的info
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
	}
}
}

class Student {

	// field
	int number;
	int year;
	int score;

	// method
	public String info(){
		return "学号：" + number + " 年级：" + year + " 成绩：" + score;
	}
}