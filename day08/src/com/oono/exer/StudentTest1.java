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
 * 
 * 此代码是对StudentTest.java的改进：将操作数组的功能封装到方法中
 */
public class StudentTest1 {
	public static void main(String[] args) {

		// 声明Student1类型的array
		Student1[] stus = new Student1[20];

		// 给Student数组的ele赋值
		for (int i = 0; i < stus.length; i++) {
			// 给数组元素赋值（非常重要！！狠容易漏掉对于我，因为理解的不好）
			// 因为：line19声明stus这个var的类型是Student1[]，这行code只会让RAM中创造一个长度为20的一维数组
			// 但这个数组的ele是null！！
			// 所以一旦不对元素首先进行赋值，元素的属性就不可能赋值，为空指针异常
			// 所以要对这20个null赋值为Student1类，这样RAM中才不是null，而是Student1的obj/instances
			stus[i] = new Student1();
			// 给数组元素的属性赋值
			stus[i].id = i + 1;
			stus[i].year = (int) (Math.random() * (6 - 1 + 1) + 1);
			stus[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);
		}

		StudentTest1 test = new StudentTest1();// ！！！仔细理解

		// 遍历学生数组
		test.traverse(stus);
		System.out.println("**************************");

		// 打印三年级学生info
		test.search(stus, 3);
		System.out.println("**************************");

		// 排序后遍历
		test.sort(stus);
		test.traverse(stus);

	}

	// 之后：将遍历、冒泡etc对数组进行的操作，封装成方法，放到main方法外面（变成与main方法平行的方法）
	// 作用：使main方法简洁，只保留调用的命令

	// 遍历Student1[]数组的操作
	public void traverse(Student1[] student_array) {
		for (int i = 0; i < student_array.length; i++) {
			System.out.println(student_array[i].info());
		}
	}

	/**
	 * @author oono
	 * @description 查找student1数组中指定年级的student info
	 * @param student_array
	 *            需要查找的数组
	 * @param year
	 *            需要查找的年级
	 */
	public void search(Student1[] student_array, int year) {
		for (int i = 0; i < student_array.length; i++) {
			if (student_array[i].year == year) {
				System.out.println(student_array[i].info());
			}
		}
	}

	/**
	 * @author oono
	 * @description 对Student1[]这个数组按score进行排序
	 * @param student_array
	 */
	public void sort(Student1[] student_array) {
		for (int i = 0; i < student_array.length - 1; i++) {
			for (int j = 0; j < student_array.length - 1 - i; j++) {
				if (student_array[j].score > student_array[j + 1].score) {
					Student1 temp = student_array[j];
					student_array[j] = student_array[j + 1];
					student_array[j + 1] = temp;
				}
			}
		}
	}
}

class Student1 {

	// field
	int id;
	int year;
	int score;

	// method

	public String info() {
		return "学号:" + id + " 年级:" + year + " 成绩:" + score;
	}

}
